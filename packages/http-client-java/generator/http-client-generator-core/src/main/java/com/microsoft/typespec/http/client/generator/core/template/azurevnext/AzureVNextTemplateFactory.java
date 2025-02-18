package com.microsoft.typespec.http.client.generator.core.template.azurevnext;

import com.microsoft.typespec.http.client.generator.core.template.DefaultTemplateFactory;
import com.microsoft.typespec.http.client.generator.core.template.ExceptionTemplate;

public class AzureVNextTemplateFactory extends DefaultTemplateFactory {

    @Override
    public AzureVNextServiceClientInterfaceTemplate getServiceClientInterfaceTemplate() {
        return AzureVNextServiceClientInterfaceTemplate.getInstance();
    }

    @Override
    public AzureVNextServiceClientTemplate getServiceClientTemplate() {
        return AzureVNextServiceClientTemplate.getInstance();
    }

    @Override
    public AzureVNextServiceClientBuilderTemplate getServiceClientBuilderTemplate() {
        return AzureVNextServiceClientBuilderTemplate.getInstance();
    }

    @Override
    public AzureVNextProxyTemplate getProxyTemplate() {
        return AzureVNextProxyTemplate.getInstance();
    }

    @Override
    public AzureVNextClientMethodTemplate getClientMethodTemplate() {
        return AzureVNextClientMethodTemplate.getInstance();
    }

    @Override
    public ExceptionTemplate getExceptionTemplate() {
        return AzureVNextExceptionTemplate.getInstance();
    }
}
