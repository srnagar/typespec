package com.microsoft.typespec.http.client.generator.core.template.azurevnext;

import com.microsoft.typespec.http.client.generator.core.template.DefaultTemplateFactory;
import com.microsoft.typespec.http.client.generator.core.template.PomTemplate;

public class AzureVNextTemplateFactory extends DefaultTemplateFactory {

    @Override
    public PomTemplate getPomTemplate() {
        return AzureVNextPomTemplate.getInstance();
    }
}
