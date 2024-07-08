import { ClassDeclaration } from "#typespec/emitter/java";
import { AccessModifier } from "../../java/access-modifier.js";

export interface ModelProps {
  name: string;
}

export function Model({ name }: ModelProps) {
  return <ClassDeclaration name={name} accessModifier={AccessModifier.public} />;
}
