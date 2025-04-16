package type.model.empty;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import type.model.empty.implementation.EmptyClientImpl;

/**
 * Initializes a new instance of the synchronous EmptyClient type.
 */
@ServiceClient(builder = EmptyClientBuilder.class)
public final class EmptyClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final EmptyClientImpl serviceClient;

    /**
     * Initializes an instance of EmptyClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    EmptyClient(EmptyClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The putEmpty operation.
     * 
     * @param input The input parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putEmptyWithResponse(Object input, RequestContext requestContext) {
        return this.serviceClient.putEmptyWithResponse(input, requestContext);
    }

    /**
     * The putEmpty operation.
     * 
     * @param input The input parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putEmpty(Object input) {
        this.serviceClient.putEmpty(input);
    }

    /**
     * The getEmpty operation.
     * 
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return empty model used in operation return type.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Object> getEmptyWithResponse(RequestContext requestContext) {
        return this.serviceClient.getEmptyWithResponse(requestContext);
    }

    /**
     * The getEmpty operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return empty model used in operation return type.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getEmpty() {
        return this.serviceClient.getEmpty();
    }

    /**
     * The postRoundTripEmpty operation.
     * 
     * @param body The body parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return empty model used in both parameter and return type.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Object> postRoundTripEmptyWithResponse(Object body, RequestContext requestContext) {
        return this.serviceClient.postRoundTripEmptyWithResponse(body, requestContext);
    }

    /**
     * The postRoundTripEmpty operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return empty model used in both parameter and return type.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object postRoundTripEmpty(Object body) {
        return this.serviceClient.postRoundTripEmpty(body);
    }
}
