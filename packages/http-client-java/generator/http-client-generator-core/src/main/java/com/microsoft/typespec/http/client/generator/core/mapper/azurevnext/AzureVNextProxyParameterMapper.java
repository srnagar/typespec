package com.microsoft.typespec.http.client.generator.core.mapper.azurevnext;

import com.microsoft.typespec.http.client.generator.core.extension.model.codemodel.Parameter;
import com.microsoft.typespec.http.client.generator.core.mapper.ProxyParameterMapper;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.IType;

public class AzureVNextProxyParameterMapper extends ProxyParameterMapper {

    private static final AzureVNextProxyParameterMapper INSTANCE = new AzureVNextProxyParameterMapper();

    public static AzureVNextProxyParameterMapper getInstance() {
        return INSTANCE;
    }

    private AzureVNextProxyParameterMapper() {
    }

    @Override
    protected boolean isRemoveModelFromParameter(Parameter parameter, IType clientType) {
        return false;
    }
}
