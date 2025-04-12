// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.typespec.http.client.generator.core.template.clientcore;

import com.microsoft.typespec.http.client.generator.core.extension.plugin.JavaSettings;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.Annotation;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.AsyncSyncClient;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.ClientAccessorMethod;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.ClientBuilder;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.ClientMethod;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.ConvenienceMethod;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.GenericType;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.MethodGroupClient;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.ServiceClient;
import com.microsoft.typespec.http.client.generator.core.model.javamodel.JavaClass;
import com.microsoft.typespec.http.client.generator.core.model.javamodel.JavaContext;
import com.microsoft.typespec.http.client.generator.core.model.javamodel.JavaFile;
import com.microsoft.typespec.http.client.generator.core.model.javamodel.JavaVisibility;
import com.microsoft.typespec.http.client.generator.core.template.IJavaTemplate;
import com.microsoft.typespec.http.client.generator.core.template.ServiceAsyncClientTemplate;
import com.microsoft.typespec.http.client.generator.core.template.ServiceSyncClientTemplate;
import com.microsoft.typespec.http.client.generator.core.template.Templates;
import com.microsoft.typespec.http.client.generator.core.util.ClientModelUtil;
import com.microsoft.typespec.http.client.generator.core.util.TemplateUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Template to create a synchronous client.
 */
public class ClientCoreServiceSyncClientTemplate extends ServiceSyncClientTemplate {

    private static final ClientCoreServiceSyncClientTemplate INSTANCE = new ClientCoreServiceSyncClientTemplate();

    protected ClientCoreServiceSyncClientTemplate() {
    }

    public static ClientCoreServiceSyncClientTemplate getInstance() {
        return INSTANCE;
    }

    protected void addGeneratedAnnotation(JavaContext classBlock) {
        classBlock.annotation(Annotation.METADATA.getName() + "(properties = {MetadataProperties.GENERATED})");
    }
}
