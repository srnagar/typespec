package com.microsoft.typespec.http.client.generator.core.template.clientcore;

import com.microsoft.typespec.http.client.generator.core.model.javamodel.JavaBlock;
import com.microsoft.typespec.http.client.generator.core.template.ConvenienceSyncMethodTemplate;

public class ClientCoreConvenienceSyncMethodTemplate extends ConvenienceSyncMethodTemplate {

    private static final ClientCoreConvenienceSyncMethodTemplate INSTANCE
        = new ClientCoreConvenienceSyncMethodTemplate();

    private ClientCoreConvenienceSyncMethodTemplate() {
    }

    public static ClientCoreConvenienceSyncMethodTemplate getInstance() {
        return INSTANCE;
    }

    @Override
    protected void createEmptyRequestOptions(JavaBlock methodBlock) {
        methodBlock.line("RequestContext requestContext = RequestContext.none();");
    }
}
