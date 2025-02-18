package com.microsoft.typespec.http.client.generator.core.template.azurevnext;

import com.microsoft.typespec.http.client.generator.core.template.ServiceClientBuilderTemplate;

public class AzureVNextServiceClientBuilderTemplate extends ServiceClientBuilderTemplate {

    private static final AzureVNextServiceClientBuilderTemplate INSTANCE = new AzureVNextServiceClientBuilderTemplate();

    private AzureVNextServiceClientBuilderTemplate() {
    }

    public static final AzureVNextServiceClientBuilderTemplate getInstance() {
        return INSTANCE;
    }
}
