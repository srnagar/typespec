package versioning.removed;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import versioning.removed.implementation.RemovedClientImpl;

/**
 * Initializes a new instance of the synchronous RemovedClient type.
 */
@ServiceClient(builder = RemovedClientBuilder.class)
public final class RemovedClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final RemovedClientImpl serviceClient;

    /**
     * Initializes an instance of RemovedClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    RemovedClient(RemovedClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The v2 operation.
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
    public Response<ModelV2> v2WithResponse(ModelV2 body, RequestContext requestContext) {
        return this.serviceClient.v2WithResponse(body, requestContext);
    }

    /**
     * The v2 operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ModelV2 v2(ModelV2 body) {
        return this.serviceClient.v2(body);
    }

    /**
     * This operation will pass different paths and different request bodies based on different versions.
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
    public Response<ModelV3> modelV3WithResponse(ModelV3 body, RequestContext requestContext) {
        return this.serviceClient.modelV3WithResponse(body, requestContext);
    }

    /**
     * This operation will pass different paths and different request bodies based on different versions.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ModelV3 modelV3(ModelV3 body) {
        return this.serviceClient.modelV3(body);
    }
}
