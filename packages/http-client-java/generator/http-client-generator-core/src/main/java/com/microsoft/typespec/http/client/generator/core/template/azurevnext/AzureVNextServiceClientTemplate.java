package com.microsoft.typespec.http.client.generator.core.template.azurevnext;

import com.microsoft.typespec.http.client.generator.core.extension.plugin.JavaSettings;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.MethodGroupClient;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.ServiceClient;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.ServiceClientProperty;
import com.microsoft.typespec.http.client.generator.core.model.javamodel.JavaBlock;
import com.microsoft.typespec.http.client.generator.core.template.ServiceClientTemplate;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class AzureVNextServiceClientTemplate extends ServiceClientTemplate {

    private static final AzureVNextServiceClientTemplate INSTANCE = new AzureVNextServiceClientTemplate();

    private AzureVNextServiceClientTemplate() {
    }

    public static final AzureVNextServiceClientTemplate getInstance() {
        return INSTANCE;
    }

    protected void writeMaxOverloadedDataPlaneConstructorImplementation(JavaBlock constructorBlock,
        ServiceClient serviceClient, Consumer<JavaBlock> constructorParametersCodes) {
        constructorBlock.line("this.httpPipeline = httpPipeline;");
        writeSerializerMemberInitialization(constructorBlock);
        constructorParametersCodes.accept(constructorBlock);

        for (ServiceClientProperty serviceClientProperty : serviceClient.getProperties()
            .stream()
            .filter(ServiceClientProperty::isReadOnly)
            .collect(Collectors.toList())) {
            if (serviceClientProperty.getDefaultValueExpression() != null) {
                constructorBlock.line("this.%s = %s;", serviceClientProperty.getName(),
                    serviceClientProperty.getDefaultValueExpression());
            }
        }

        for (MethodGroupClient methodGroupClient : serviceClient.getMethodGroupClients()) {
            constructorBlock.line("this.%s = new %s(this);", methodGroupClient.getVariableName(),
                methodGroupClient.getClassName());
        }

        if (serviceClient.getProxy() != null) {
            String implName = JavaSettings.getInstance().getPackage() + ".implementation."
                + serviceClient.getProxy().getName() + "Impl";
            constructorBlock.line("this.service = %s.getNewInstance(this.httpPipeline);", implName);
        }
    }
}
