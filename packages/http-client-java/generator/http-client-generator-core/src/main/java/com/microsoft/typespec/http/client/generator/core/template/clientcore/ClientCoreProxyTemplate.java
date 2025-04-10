package com.microsoft.typespec.http.client.generator.core.template.clientcore;

import com.microsoft.typespec.http.client.generator.core.template.ProxyTemplate;

public class ClientCoreProxyTemplate extends ProxyTemplate {

    private static final ClientCoreProxyTemplate INSTANCE = new ClientCoreProxyTemplate();

    private ClientCoreProxyTemplate() {

    }

    public static ClientCoreProxyTemplate getInstance() {
        return INSTANCE;
    }
}
