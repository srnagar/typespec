import { code } from "#typespec/emitter/core";
import { AppFolderRecord } from "./app-folder.js";

export interface ClientProps {
  folder: AppFolderRecord;
}

export function Client({ folder }: ClientProps) {
  const imports = [];
  imports.push(`import com.azure.core.credential.TokenCredential`);
  return code`
    ${imports.join(";\n") + ";"} 
    
    public class ${folder.moduleName}Client {
      private final ${folder.moduleName}ServiceClient innerClient;
      
      public ${folder.moduleName}Client(${folder.moduleName}ServiceClient innerClient) {
        this.innerClient = innerClient;
      }
}`;
}
