import { code } from "#typespec/emitter/core";
import { AppFolderRecord } from "./app-folder.js";

export interface ModelProps {
  name: string;
}

export function Model({ name }: ModelProps) {
  console.log("ModelComp: Creating file for model: " + name);
  const imports = [];

  imports.push(`import com.azure.core.credential.TokenCredential`);
  return code`
    ${imports.join(";\n") + ";"} 
    
    public class ${name} {
      
}`;
}
