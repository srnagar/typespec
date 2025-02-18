package com.microsoft.typespec.http.client.generator.core.template.azurevnext;

import com.microsoft.typespec.http.client.generator.core.template.ProxyTemplate;

public class AzureVNextProxyTemplate extends ProxyTemplate {

    public static final AzureVNextProxyTemplate INSTANCE = new AzureVNextProxyTemplate();

    private AzureVNextProxyTemplate() {
    }

    public static final AzureVNextProxyTemplate getInstance() {
        return INSTANCE;
    }
}
