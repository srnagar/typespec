import { BaseDeclaration, BaseDeclarationProps } from "./BaseDeclaration.jsx";
import * as ay from "@alloy-js/core";
import { code, DeclarationContext, OutputScope, OutputSymbol, refkey, useBinder, useScope } from "@alloy-js/core";
import * as jv from "@alloy-js/java";


export interface ClassDeclarationProps  extends BaseDeclarationProps{
  extends?: ay.Children;
  implements?: ay.Children;
}

export function ClassDeclaration(props: ClassDeclarationProps) {
  const binder = useBinder();
  console.log("class declaration props", props.name);
  const rk = refkey(props.name);

  const declaration = binder.createSymbol({
    name: props.name!,
    refkey: rk,
  });

  return <DeclarationContext.Provider value={declaration}>
    {code`class ${declaration.name} {`}
    {props.children}
    {code`}`}
  </DeclarationContext.Provider>;
 
}
