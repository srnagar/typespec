import { Type } from "@typespec/compiler";
import { AccessModifier } from "./access-modifier.js";
import { ClassDeclaration } from "./class-declaration.js";

export interface TypeDeclarationProps {
  type: Type;
}

export function TypeDeclaration({ type }: TypeDeclarationProps) {
  switch (type.kind) {
    case "Model":
      return <ClassDeclaration name={type.name} accessModifier={AccessModifier.public} />;
    default:
      throw new Error("Not yet supported");
  }
}
