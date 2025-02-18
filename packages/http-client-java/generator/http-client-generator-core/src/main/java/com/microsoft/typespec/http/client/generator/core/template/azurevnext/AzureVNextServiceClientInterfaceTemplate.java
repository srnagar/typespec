package com.microsoft.typespec.http.client.generator.core.template.azurevnext;

import com.microsoft.typespec.http.client.generator.core.template.ServiceClientInterfaceTemplate;

public class AzureVNextServiceClientInterfaceTemplate extends ServiceClientInterfaceTemplate {
    private static final AzureVNextServiceClientInterfaceTemplate INSTANCE
        = new AzureVNextServiceClientInterfaceTemplate();

    private AzureVNextServiceClientInterfaceTemplate() {
    }

    public static AzureVNextServiceClientInterfaceTemplate getInstance() {
        return INSTANCE;
    }
}
