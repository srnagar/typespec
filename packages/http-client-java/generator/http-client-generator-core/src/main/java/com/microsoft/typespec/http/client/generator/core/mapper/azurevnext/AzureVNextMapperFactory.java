package com.microsoft.typespec.http.client.generator.core.mapper.azurevnext;

import com.microsoft.typespec.http.client.generator.core.mapper.ClientParameterMapper;
import com.microsoft.typespec.http.client.generator.core.mapper.DefaultMapperFactory;
import com.microsoft.typespec.http.client.generator.core.mapper.PomMapper;
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

    @Override
    public PomMapper getPomMapper() {
        return AzureVNextPomMapper.getInstance();
    }

    @Override
    public ClientParameterMapper getClientParameterMapper() {
        return AzureVNextClientParameterMapper.getInstance();
    }
}
