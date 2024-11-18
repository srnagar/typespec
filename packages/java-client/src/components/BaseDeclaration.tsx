import { Children, code, DeclarationContext, refkey, Refkey, useBinder } from "@alloy-js/core";

export interface BaseDeclarationProps {
  name: string;
  refkey?: Refkey;
  public?: boolean;
  static?: boolean;
  final?: boolean;
  children?: Children;
  kind?: "type" | "value";
}

export function BaseDeclaration(props: BaseDeclarationProps) {

  const binder = useBinder();
  console.log("base declaration props", props.name);
  const rk = refkey(props.name);

  const declaration = binder.createSymbol({
    name: props.name!,
    refkey: rk,
  });

  return <DeclarationContext.Provider value={declaration}>
    {props.children}
  </DeclarationContext.Provider>;
}
