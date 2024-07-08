import { ClassDeclaration } from "#typespec/emitter/java";
import { AccessModifier } from "../../java/access-modifier.js";
import { AppFolderRecord } from "./app-folder.js";

export interface ClientProps {
  folder: AppFolderRecord;
}

export function Client({ folder }: ClientProps) {
  const imports = [];
  imports.push(`import com.azure.core.credential.TokenCredential`);

  return (
    <ClassDeclaration name={`${folder.moduleName}Client`} accessModifier={AccessModifier.public} />
  );
}
