import { code } from "#typespec/emitter/core";
import { AppFolderRecord } from "./app-folder.js";

export interface AsyncClientProps {
  folder: AppFolderRecord;
}

export function AsyncClient({ folder }: AsyncClientProps) {
  const imports = [];
  imports.push(`import com.azure.core.credential.TokenCredential`);
  return code`
    ${imports.join(";\n") + ";"} 
    
    public class ${folder.moduleName}AsyncClient {
      private final ${folder.moduleName}ServiceClient innerClient;
      
      public ${folder.moduleName}AsyncClient(${folder.moduleName}ServiceClient innerClient) {
        this.innerClient = innerClient;
      }
}`;
}
