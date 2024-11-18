import { EmitContext } from "@typespec/compiler";
import { $ } from "@typespec/compiler/typekit";
import * as ay from "@alloy-js/core";
import * as jv from "@alloy-js/java";
import { ClassDeclaration } from "./components/ClassDeclaration.jsx";
import { ClassMemberDeclaration } from "./components/ClassMemberDeclaration.jsx";
import { DeclarationContext, MemberDeclarationContext, OutputScope, ScopeContext, useContext } from "@alloy-js/core";

export async function $onEmit(context: EmitContext) {

  {await import("./extension.js")}
  console.log(context.options);

  const artifactId = context.options.artifactId ?? "java-test-client";
  const groupId = context.options.groupId ?? "io.typespec";
  const version = context.options.version ?? "1.0.0-beta.1";
  return (
    <ay.Output>
      <ay.SourceDirectory path={artifactId}>
        {createPom(artifactId, groupId, version)}
        <ay.SourceDirectory path="src/main/java">
          <ay.SourceFile path="io/typespec/generated/Main.java" filetype="java">
            <ay.Scope name="Main" kind="class">
              <ClassDeclaration name="Main">
                
                <ay.Scope name="id">
                  <ClassMemberDeclaration name="id" type="String" private>
                    {
                      () => {
                        const sym = useContext(MemberDeclarationContext)!;
                        console.log("MEMBER Symbol name: ", sym.name);
                        let scope: OutputScope | undefined = sym.scope;
                        while (scope) {
                          console.log(scope.name);
                          scope = scope.parent;
                        }
                      }
                    }
                  </ClassMemberDeclaration>
                </ay.Scope>
                  {
                    () => {
                      const sym = useContext(DeclarationContext)!;
                      console.log("CLASS Symbol name: ", sym.name);
                      let scope: OutputScope | undefined = sym.scope;
                      while (scope) {
                        console.log(scope.name);
                        scope = scope.parent;
                      }
                    }
                  }
                  
              </ClassDeclaration>
            </ay.Scope>
          </ay.SourceFile>
        </ay.SourceDirectory>
      </ay.SourceDirectory>
  </ay.Output>
  );
}


function createPom(artifactId: string, groupId: string, version: string) {
  return (
    <ay.SourceFile path="pom.xml" filetype="xml">
      pom file contents here
    </ay.SourceFile>
  );
}
