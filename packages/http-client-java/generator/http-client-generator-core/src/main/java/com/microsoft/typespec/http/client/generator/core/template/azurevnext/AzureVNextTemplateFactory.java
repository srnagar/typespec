package com.microsoft.typespec.http.client.generator.core.template.azurevnext;

import com.microsoft.typespec.http.client.generator.core.template.ClientMethodTemplate;
import com.microsoft.typespec.http.client.generator.core.template.DefaultTemplateFactory;
import com.microsoft.typespec.http.client.generator.core.template.ExceptionTemplate;
import com.microsoft.typespec.http.client.generator.core.template.MethodGroupTemplate;
import com.microsoft.typespec.http.client.generator.core.template.PomTemplate;
import com.microsoft.typespec.http.client.generator.core.template.ProxyTemplate;
import com.microsoft.typespec.http.client.generator.core.template.ServiceClientBuilderTemplate;
import com.microsoft.typespec.http.client.generator.core.template.ServiceClientInterfaceTemplate;
import com.microsoft.typespec.http.client.generator.core.template.ServiceClientTemplate;

public class AzureVNextTemplateFactory extends DefaultTemplateFactory {

    @Override
    public ServiceClientInterfaceTemplate getServiceClientInterfaceTemplate() {
        return AzureVNextServiceClientInterfaceTemplate.getInstance();
    }

    @Override
    public ServiceClientTemplate getServiceClientTemplate() {
        return AzureVNextServiceClientTemplate.getInstance();
    }

    @Override
    public ServiceClientBuilderTemplate getServiceClientBuilderTemplate() {
        return AzureVNextServiceClientBuilderTemplate.getInstance();
    }

    @Override
    public ProxyTemplate getProxyTemplate() {
        return AzureVNextProxyTemplate.getInstance();
    }

    @Override
    public ClientMethodTemplate getClientMethodTemplate() {
        return AzureVNextClientMethodTemplate.getInstance();
    }

    @Override
    public ExceptionTemplate getExceptionTemplate() {
        return AzureVNextExceptionTemplate.getInstance();
    }

    @Override
    public PomTemplate getPomTemplate() {
        return AzureVNextPomTemplate.getInstance();
    }

    @Override
    public MethodGroupTemplate getMethodGroupTemplate() {
        return AzureVNextMethodGroupTemplate.getInstance();
    }
}
