import { code } from "#typespec/emitter/core";
import { AppFolderRecord } from "./app-folder.js";

export interface ClientBuilderProps {
  folder: AppFolderRecord;
}

export function ClientBuilder({ folder }: ClientBuilderProps) {
  const imports = [];
  imports.push(`import com.azure.core.credential.TokenCredential`);
  return code`
    ${imports.join(";\n") + ";"}
    
    public class ${folder.moduleName}ClientBuilder {
      private final TokenCredential tokenCredential;
      private final String endpoint;
      
      public ${folder.moduleName}ClientBuilder() {
        
      }
      public ${folder.moduleName}ClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = tokenCredential;
        return this;
      }
      
      public ${folder.moduleName}AsyncClient buildAsyncClient() {
        return new ${folder.moduleName}AsyncClient(tokenCredential, endpoint);
      }
      
      public ${folder.moduleName}Client buildClient() {
        return new ${folder.moduleName}Client(tokenCredential, endpoint);
      }
}`;
}
