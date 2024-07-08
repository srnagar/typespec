import { ComponentChildren } from "#jsx/jsx-runtime";
import { Declaration } from "../framework/components/declaration.js";
import { code } from "../framework/core/code.js";
import { AccessModifier } from "./access-modifier.js";
import { ClassConstructor } from "./class-constructor.js";

export interface ClassDeclarationProps {
  name: string;
  accessModifier: AccessModifier;
  children?: ComponentChildren;
}

export function ClassDeclaration({ name, accessModifier, children }: ClassDeclarationProps) {
  const accessModifierCode = accessModifier === AccessModifier.packagePrivate ? "" : `${accessModifier} `;

  return (
    <Declaration name={name} refkey={name}>
      {code`
        ${accessModifierCode} class ${name} {
        ${(<ClassConstructor className={name} accessModifier={AccessModifier.public} />)}
}
      `}
    </Declaration>
  );
}
