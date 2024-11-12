import { code, defineSlot, Name, OutputScope, resolveFQN, DeclarationContext, useContext } from "@alloy-js/core";
import * as jv from "@alloy-js/java";
import { ModelProperty } from "@typespec/compiler";
import { getTemplateParams } from "../utils.js";
import { TypeExpression } from "./type-expression.js";

export interface SetterProps {
  type: ModelProperty;
}

export const CustomMethodBodySlot = defineSlot<SetterProps>((query: { name: string }) =>
  resolveFQN(query.name));



/**
 * Generate setter for a model member
 */
export function Setter(props: SetterProps) {

  const sym = jv.createJavaSymbol({
    name: "CustomMethodBodySlot"
  });

  const CustomMethodBodySlotInstance = CustomMethodBodySlot.create(
    sym,
    props,
    code`
      // default setter
      this.${props.type.name} = ${props.type.name};
      return this;
    `
  );

  const accessName = props.type.name.charAt(0).toUpperCase() + props.type.name.slice(1);

  // Need to figure out model declaration so we can specify return type
  const generics = props?.type?.model?.node ? getTemplateParams(props.type.model.node) : undefined;
  const genericObject: Record<string, string> = {};
  generics?.forEach((generic) => (genericObject[generic] = ""));

  const returnType = code`${<Name/>} ${(generics?.length ?? 0) >= 1 ? <jv.Generics types={Object.keys(genericObject)} /> : ""}`;

  return (
    <jv.Method
      name={"set" + accessName}
      public
      return={returnType}
      parameters={{ [props.type.name]: <TypeExpression type={props.type} /> }}
    >
      <CustomMethodBodySlotInstance />
    </jv.Method>
  );
}
