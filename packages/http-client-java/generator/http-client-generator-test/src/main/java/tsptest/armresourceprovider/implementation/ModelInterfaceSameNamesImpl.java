// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package tsptest.armresourceprovider.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import tsptest.armresourceprovider.fluent.ModelInterfaceSameNamesClient;
import tsptest.armresourceprovider.fluent.models.ModelInterfaceSameNameInner;
import tsptest.armresourceprovider.models.ModelInterfaceSameName;
import tsptest.armresourceprovider.models.ModelInterfaceSameNames;

public final class ModelInterfaceSameNamesImpl implements ModelInterfaceSameNames {
    private static final ClientLogger LOGGER = new ClientLogger(ModelInterfaceSameNamesImpl.class);

    private final ModelInterfaceSameNamesClient innerClient;

    private final tsptest.armresourceprovider.ArmResourceProviderManager serviceManager;

    public ModelInterfaceSameNamesImpl(ModelInterfaceSameNamesClient innerClient,
        tsptest.armresourceprovider.ArmResourceProviderManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ModelInterfaceSameName> getByResourceGroupWithResponse(String resourceGroupName,
        String modelInterfaceDifferentNameName, Context context) {
        Response<ModelInterfaceSameNameInner> inner = this.serviceClient()
            .getByResourceGroupWithResponse(resourceGroupName, modelInterfaceDifferentNameName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ModelInterfaceSameNameImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ModelInterfaceSameName getByResourceGroup(String resourceGroupName, String modelInterfaceDifferentNameName) {
        ModelInterfaceSameNameInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, modelInterfaceDifferentNameName);
        if (inner != null) {
            return new ModelInterfaceSameNameImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ModelInterfaceSameNamesClient serviceClient() {
        return this.innerClient;
    }

    private tsptest.armresourceprovider.ArmResourceProviderManager manager() {
        return this.serviceManager;
    }
}
