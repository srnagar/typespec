package com.microsoft.typespec.http.client.generator.core.mapper.clientcore;

import com.microsoft.typespec.http.client.generator.core.mapper.ClientParameterMapper;

public class ClientCoreClientParameterMapper extends ClientParameterMapper {
    private static final ClientCoreClientParameterMapper INSTANCE = new ClientCoreClientParameterMapper();

    private ClientCoreClientParameterMapper() {

    }

    public static ClientCoreClientParameterMapper getInstance() {
        return INSTANCE;
    }
}
