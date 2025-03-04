package com.microsoft.typespec.http.client.generator.core.template.azurevnext;

import com.microsoft.typespec.http.client.generator.core.extension.plugin.JavaSettings;
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

        String implName = JavaSettings.getInstance().getPackage() + ".implementation."
            + methodGroupClient.getProxy().getName() + "Impl";
        constructor.line("this.service = %s.getNewInstance(this.httpPipeline, null);", implName);
    }
}
