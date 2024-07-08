import { ComponentChildren } from "#jsx/jsx-runtime";
import { code } from "../framework/core/code.js";
import { AccessModifier } from "./access-modifier.js";

export interface MethodProps {
  methodName: string;
  accessModifier: AccessModifier;
  returnType: string;
  isStatic?: boolean;
  children?: ComponentChildren;
}

export function Method({ methodName, accessModifier, returnType, isStatic, children }: MethodProps) {

  const accessModifierCode =
    accessModifier === AccessModifier.packagePrivate ? "" : `${accessModifier} `;
  return code`
          ${accessModifierCode} ${returnType} ${methodName}() {
          }
      `;
}
