package routes;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import routes.implementation.QueryParametersImpl;

/**
 * Initializes a new instance of the synchronous RoutesClient type.
 */
@ServiceClient(builder = RoutesClientBuilder.class)
public final class QueryParametersClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final QueryParametersImpl serviceClient;

    /**
     * Initializes an instance of QueryParametersClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    QueryParametersClient(QueryParametersImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The templateOnly operation.
     * 
     * @param param The param parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> templateOnlyWithResponse(String param, RequestContext requestContext) {
        return this.serviceClient.templateOnlyWithResponse(param, requestContext);
    }

    /**
     * The templateOnly operation.
     * 
     * @param param The param parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void templateOnly(String param) {
        this.serviceClient.templateOnly(param);
    }

    /**
     * The explicit operation.
     * 
     * @param param The param parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> explicitWithResponse(String param, RequestContext requestContext) {
        return this.serviceClient.explicitWithResponse(param, requestContext);
    }

    /**
     * The explicit operation.
     * 
     * @param param The param parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void explicit(String param) {
        this.serviceClient.explicit(param);
    }

    /**
     * The annotationOnly operation.
     * 
     * @param param The param parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> annotationOnlyWithResponse(String param, RequestContext requestContext) {
        return this.serviceClient.annotationOnlyWithResponse(param, requestContext);
    }

    /**
     * The annotationOnly operation.
     * 
     * @param param The param parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void annotationOnly(String param) {
        this.serviceClient.annotationOnly(param);
    }
}
