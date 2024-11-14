// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armstreamstyleserialization.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.cadl.armstreamstyleserialization.fluent.TopLevelArmResourcesClient;
import com.cadl.armstreamstyleserialization.fluent.models.TopLevelArmResourceInner;
import com.cadl.armstreamstyleserialization.models.TopLevelArmResource;
import com.cadl.armstreamstyleserialization.models.TopLevelArmResourceTagsUpdate;
import com.cadl.armstreamstyleserialization.models.TopLevelArmResources;

public final class TopLevelArmResourcesImpl implements TopLevelArmResources {
    private static final ClientLogger LOGGER = new ClientLogger(TopLevelArmResourcesImpl.class);

    private final TopLevelArmResourcesClient innerClient;

    private final com.cadl.armstreamstyleserialization.ArmStreamStyleSerializationManager serviceManager;

    public TopLevelArmResourcesImpl(TopLevelArmResourcesClient innerClient,
        com.cadl.armstreamstyleserialization.ArmStreamStyleSerializationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public TopLevelArmResource update(String resourceGroupName, String topLevelArmResourceName,
        TopLevelArmResourceTagsUpdate properties) {
        TopLevelArmResourceInner inner
            = this.serviceClient().update(resourceGroupName, topLevelArmResourceName, properties);
        if (inner != null) {
            return new TopLevelArmResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TopLevelArmResource update(String resourceGroupName, String topLevelArmResourceName,
        TopLevelArmResourceTagsUpdate properties, Context context) {
        TopLevelArmResourceInner inner
            = this.serviceClient().update(resourceGroupName, topLevelArmResourceName, properties, context);
        if (inner != null) {
            return new TopLevelArmResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private TopLevelArmResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.cadl.armstreamstyleserialization.ArmStreamStyleSerializationManager manager() {
        return this.serviceManager;
    }
}
