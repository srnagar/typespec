package com.microsoft.typespec.http.client.generator.core.template.azurevnext;

import com.microsoft.typespec.http.client.generator.core.model.javamodel.JavaBlock;
import com.microsoft.typespec.http.client.generator.core.template.ConvenienceSyncMethodTemplate;

public class AzureVNextConvenienceSyncMethodTemplate extends ConvenienceSyncMethodTemplate {

    private static final AzureVNextConvenienceSyncMethodTemplate INSTANCE
        = new AzureVNextConvenienceSyncMethodTemplate();

    private AzureVNextConvenienceSyncMethodTemplate() {

    }

    public static AzureVNextConvenienceSyncMethodTemplate instance() {
        return INSTANCE;
    }

    @Override
    protected void createEmptyRequestOptions(JavaBlock methodBlock) {
        methodBlock.line("RequestContext.Builder requestContextBuilder = RequestContext.builder()");
    }
}
