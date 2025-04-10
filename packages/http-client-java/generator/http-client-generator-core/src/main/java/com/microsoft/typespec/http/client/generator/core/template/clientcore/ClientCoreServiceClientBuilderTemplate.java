package com.microsoft.typespec.http.client.generator.core.template.clientcore;

import com.microsoft.typespec.http.client.generator.core.template.ServiceClientBuilderTemplate;

public class ClientCoreServiceClientBuilderTemplate extends ServiceClientBuilderTemplate {

    private static final ClientCoreServiceClientBuilderTemplate INSTANCE = new ClientCoreServiceClientBuilderTemplate();

    private ClientCoreServiceClientBuilderTemplate() {

    }

    public static ClientCoreServiceClientBuilderTemplate getInstance() {
        return INSTANCE;
    }
}
