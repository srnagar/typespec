import { createTypeSpecLibrary } from "@typespec/compiler";

export const $lib = createTypeSpecLibrary({
  name: "java-client",
  diagnostics: {},
});

export const { reportDiagnostic, createDiagnostic } = $lib;
