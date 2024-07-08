import { ComponentChildren } from "#jsx/jsx-runtime";
import { code } from "../framework/core/code.js";
import { AccessModifier } from "./access-modifier.js";

export interface ClassConstructorProps {
  className: string;
  accessModifier: AccessModifier;
  children?: ComponentChildren;
}

export function ClassConstructor({ className, accessModifier, children }: ClassConstructorProps) {
  const accessModifierCode =
    accessModifier === AccessModifier.packagePrivate ? "" : `${accessModifier} `;
  return code`
              ${accessModifierCode} ${className}() {
              }
      `;
}
