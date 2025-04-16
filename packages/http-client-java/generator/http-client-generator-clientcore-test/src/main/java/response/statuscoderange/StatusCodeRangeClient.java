package response.statuscoderange;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import response.statuscoderange.implementation.StatusCodeRangeClientImpl;

/**
 * Initializes a new instance of the synchronous StatusCodeRangeClient type.
 */
@ServiceClient(builder = StatusCodeRangeClientBuilder.class)
public final class StatusCodeRangeClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final StatusCodeRangeClientImpl serviceClient;

    /**
     * Initializes an instance of StatusCodeRangeClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    StatusCodeRangeClient(StatusCodeRangeClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The errorResponseStatusCodeInRange operation.
     * 
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> errorResponseStatusCodeInRangeWithResponse(RequestContext requestContext) {
        return this.serviceClient.errorResponseStatusCodeInRangeWithResponse(requestContext);
    }

    /**
     * The errorResponseStatusCodeInRange operation.
     * 
     * @throws DefaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void errorResponseStatusCodeInRange() {
        this.serviceClient.errorResponseStatusCodeInRange();
    }

    /**
     * The errorResponseStatusCode404 operation.
     * 
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> errorResponseStatusCode404WithResponse(RequestContext requestContext) {
        return this.serviceClient.errorResponseStatusCode404WithResponse(requestContext);
    }

    /**
     * The errorResponseStatusCode404 operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void errorResponseStatusCode404() {
        this.serviceClient.errorResponseStatusCode404();
    }
}
