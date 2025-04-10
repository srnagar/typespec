package com.microsoft.typespec.http.client.generator.core.template.clientcore;

import com.microsoft.typespec.http.client.generator.core.template.ServiceClientInterfaceTemplate;

public class ClientCoreServiceClientInterfaceTemplate extends ServiceClientInterfaceTemplate {
    private static final ClientCoreServiceClientInterfaceTemplate INSTANCE
        = new ClientCoreServiceClientInterfaceTemplate();

    private ClientCoreServiceClientInterfaceTemplate() {
    }

    public static ServiceClientInterfaceTemplate getInstance() {
        return INSTANCE;
    }

}
