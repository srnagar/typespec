package com.microsoft.typespec.http.client.generator.core.mapper.azurevnext;

import com.microsoft.typespec.http.client.generator.core.extension.model.codemodel.Parameter;
import com.microsoft.typespec.http.client.generator.core.mapper.ClientParameterMapper;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.ClientMethodParameter;

public class AzureVNextClientParameterMapper extends ClientParameterMapper {
    private static final AzureVNextClientParameterMapper INSTANCE = new AzureVNextClientParameterMapper();

    public static AzureVNextClientParameterMapper getInstance() {
        return INSTANCE;
    }

    protected AzureVNextClientParameterMapper() {
    }

    @Override
    public ClientMethodParameter map(Parameter parameter) {
        return map(parameter, false);
    }
}
