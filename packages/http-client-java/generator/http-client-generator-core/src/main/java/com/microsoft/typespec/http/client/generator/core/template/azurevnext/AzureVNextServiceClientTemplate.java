package com.microsoft.typespec.http.client.generator.core.template.azurevnext;

import com.microsoft.typespec.http.client.generator.core.template.ServiceClientTemplate;

public class AzureVNextServiceClientTemplate extends ServiceClientTemplate {

    private static final AzureVNextServiceClientTemplate INSTANCE = new AzureVNextServiceClientTemplate();

    private AzureVNextServiceClientTemplate() {
    }

    public static final AzureVNextServiceClientTemplate getInstance() {
        return INSTANCE;
    }
}
