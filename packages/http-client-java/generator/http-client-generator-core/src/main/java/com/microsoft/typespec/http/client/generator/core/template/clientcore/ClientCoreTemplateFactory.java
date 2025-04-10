package com.microsoft.typespec.http.client.generator.core.template.clientcore;

import com.microsoft.typespec.http.client.generator.core.template.ClientMethodTemplate;
import com.microsoft.typespec.http.client.generator.core.template.ConvenienceSyncMethodTemplate;
import com.microsoft.typespec.http.client.generator.core.template.DefaultTemplateFactory;
import com.microsoft.typespec.http.client.generator.core.template.ExceptionTemplate;
import com.microsoft.typespec.http.client.generator.core.template.MethodGroupTemplate;
import com.microsoft.typespec.http.client.generator.core.template.PomTemplate;
import com.microsoft.typespec.http.client.generator.core.template.ProxyTemplate;
import com.microsoft.typespec.http.client.generator.core.template.ServiceClientBuilderTemplate;
import com.microsoft.typespec.http.client.generator.core.template.ServiceClientInterfaceTemplate;
import com.microsoft.typespec.http.client.generator.core.template.ServiceClientTemplate;

public class ClientCoreTemplateFactory extends DefaultTemplateFactory {
    @Override
    public ServiceClientInterfaceTemplate getServiceClientInterfaceTemplate() {
        return ClientCoreServiceClientInterfaceTemplate.getInstance();
    }

    @Override
    public ServiceClientTemplate getServiceClientTemplate() {
        return ClientCoreServiceClientTemplate.getInstance();
    }

    @Override
    public ServiceClientBuilderTemplate getServiceClientBuilderTemplate() {
        return ClientCoreServiceClientBuilderTemplate.getInstance();
    }

    @Override
    public ProxyTemplate getProxyTemplate() {
        return ClientCoreProxyTemplate.getInstance();
    }

    @Override
    public ClientMethodTemplate getClientMethodTemplate() {
        return ClientCoreClientMethodTemplate.getInstance();
    }

    @Override
    public ExceptionTemplate getExceptionTemplate() {
        return ClientCoreExceptionTemplate.getInstance();
    }

    @Override
    public PomTemplate getPomTemplate() {
        return ClientCorePomTemplate.getInstance();
    }

    @Override
    public MethodGroupTemplate getMethodGroupTemplate() {
        return ClientCoreMethodGroupTemplate.getInstance();
    }

    @Override
    public ConvenienceSyncMethodTemplate getConvenienceSyncMethodTemplate() {
        return ClientCoreConvenienceSyncMethodTemplate.getInstance();
    }
}
