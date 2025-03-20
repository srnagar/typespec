package com.microsoft.typespec.http.client.generator.core.template.azurevnext;

import com.microsoft.typespec.http.client.generator.core.extension.plugin.JavaSettings;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.ClassType;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.MethodGroupClient;
import com.microsoft.typespec.http.client.generator.core.model.javamodel.JavaBlock;
import com.microsoft.typespec.http.client.generator.core.template.MethodGroupTemplate;

public class AzureVNextMethodGroupTemplate extends MethodGroupTemplate {

    private static final AzureVNextMethodGroupTemplate INSTANCE = new AzureVNextMethodGroupTemplate();

    public static AzureVNextMethodGroupTemplate getInstance() {
        return INSTANCE;
    }

    @Override
    protected void writeServiceProxyConstruction(JavaBlock constructor, MethodGroupClient methodGroupClient) {

        if (JavaSettings.getInstance().useRestProxy()) {
            constructor.line(String.format("this.service = %1$s.create(%2$s.class, client.getHttpPipeline());",
                ClassType.REST_PROXY.getName(), methodGroupClient.getProxy().getName()));
        } else {
            constructor.line("this.service = %s.getNewInstance(client.getHttpPipeline());", ClassType.REST_PROXY.getName());
        }

    }
}
