package com.microsoft.typespec.http.client.generator.core.mapper.azurevnext;

import com.microsoft.typespec.http.client.generator.core.mapper.DefaultMapperFactory;
import com.microsoft.typespec.http.client.generator.core.mapper.ProxyParameterMapper;

public class AzureVNextMapperFactory extends DefaultMapperFactory {

    @Override
    public AzureVNextProxyMethodMapper getProxyMethodMapper() {
        return AzureVNextProxyMethodMapper.getInstance();
    }

    @Override
    public AzureVNextClientMethodMapper getClientMethodMapper() {
        return AzureVNextClientMethodMapper.getInstance();
    }

    @Override
    public ProxyParameterMapper getProxyParameterMapper() {
        return AzureVNextProxyParameterMapper.getInstance();
    }
}
