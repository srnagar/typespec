package versioning.added;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import versioning.added.implementation.InterfaceV2sImpl;

/**
 * Initializes a new instance of the synchronous AddedClient type.
 */
@ServiceClient(builder = AddedClientBuilder.class)
public final class InterfaceV2Client {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final InterfaceV2sImpl serviceClient;

    /**
     * Initializes an instance of InterfaceV2Client class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    InterfaceV2Client(InterfaceV2sImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The v2InInterface operation.
     * 
     * @param body The body parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ModelV2> v2InInterfaceWithResponse(ModelV2 body, RequestContext requestContext) {
        return this.serviceClient.v2InInterfaceWithResponse(body, requestContext);
    }

    /**
     * The v2InInterface operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ModelV2 v2InInterface(ModelV2 body) {
        return this.serviceClient.v2InInterface(body);
    }
}
