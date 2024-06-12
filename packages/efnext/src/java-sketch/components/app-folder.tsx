import { Scope, SourceDirectory, SourceFile } from "#typespec/emitter/core";
import { TypeDeclaration } from "#typespec/emitter/java";
import { Operation, Type } from "@typespec/compiler";

import { AsyncClient } from "./async-client.js";
import { ClientBuilder } from "./client-builder.js";
import { ClientOperation } from "./client-operation.js";
import { Client } from "./client.js";
import { Model } from "./model.js";

export interface AppFolderRecord {
  path: string;
  moduleName: string;
  types: Declaration[];
  operations: Operation[];
  subfolders: AppFolderRecord[];
}

export interface AppFolderProps {
  folder: AppFolderRecord;
}

type Declaration = Type & { name: string };
/**
 * This component takes an AppFolder and unpacks it, creating the needed directory,
 * source files, etc.
 */
export function AppFolder({ folder }: AppFolderProps) {
  const models = folder.types.map((t) => [<TypeDeclaration type={t} />, "\n"]);

  const operations = folder.operations.map((o) => <ClientOperation operation={o} />);
  const subfolders = folder.subfolders.map((s) => <AppFolder folder={s} />);

  const rootPackage = folder.moduleName;
  const builder = folder.moduleName + "ClientBuilder.java";
  const asyncClient = folder.moduleName + "AsyncClient.java";
  const syncClient = folder.moduleName + "Client.java";
  return (
    <SourceDirectory path={rootPackage.toLowerCase()}>
      {operations.length > 0 && (
        <Scope name={rootPackage}>
          <SourceFile path={builder} filetype="java">
            <ClientBuilder folder={folder} />
          </SourceFile>
          <SourceFile path={asyncClient} filetype="java">
            <AsyncClient folder={folder} />
          </SourceFile>
          <SourceFile path={syncClient} filetype="java">
            <Client folder={folder} />
          </SourceFile>
        </Scope>
      )}

      {models.length > 0 && (
        <SourceDirectory path="models">
          <Scope name={folder.moduleName + "models"}>
            {folder.types.map((m) => {
              return (
                <SourceFile path={m.name + ".java"} filetype="java">
                  <Model name={m.name} />
                </SourceFile>
              );
            })}
          </Scope>
        </SourceDirectory>
      )}
      {subfolders}
    </SourceDirectory>
  );
}
