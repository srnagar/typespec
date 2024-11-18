import { BaseDeclaration, BaseDeclarationProps } from "./BaseDeclaration.jsx";
import * as ay from "@alloy-js/core";
import { code, ComponentContext, createContext, MemberDeclarationContext, OutputSymbol, refkey, useBinder } from "@alloy-js/core";
import * as jv from "@alloy-js/java";


export interface ClassMemberDeclarationProps  extends BaseDeclarationProps{
  type: string;
  private?: boolean;
  packagePrivate?: boolean;
}


export function ClassMemberDeclaration(props: ClassMemberDeclarationProps) {
  const binder = useBinder();

  console.log("member declaration props", props.name);
  const rk = refkey(props.name);
  // const flags = ay.OutputSymbolFlags.InstanceMember;

  const declaration = binder.createSymbol({
    name: props.name!,
    refkey: rk,
    // flags: flags,
  });

  console.log("member declaration", declaration.name);

  
  return <MemberDeclarationContext.Provider value={declaration}>
    {code`private ${props.type} ${declaration.name};`}
    {props.children}
  </MemberDeclarationContext.Provider>
}
