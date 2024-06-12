import { Operation } from "@typespec/compiler";
import { getRefkey } from "#typespec/emitter/core";
import { Function, Reference } from "#typespec/emitter/java";

interface ClientOperationProps {
  operation: Operation;
}

export function ClientOperation({ operation }: ClientOperationProps) {
  return (
    <Function type={operation}>
      return <Reference refkey={getRefkey(operation, "internal")} />
    </Function>
  );
}
