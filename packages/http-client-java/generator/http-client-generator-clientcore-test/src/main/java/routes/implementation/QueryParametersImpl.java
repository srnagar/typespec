package routes.implementation;

import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceInterface;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.annotations.HostParam;
import io.clientcore.core.http.annotations.HttpRequestInformation;
import io.clientcore.core.http.annotations.QueryParam;
import io.clientcore.core.http.annotations.UnexpectedResponseExceptionDetail;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.http.pipeline.HttpPipeline;
import java.lang.reflect.InvocationTargetException;

/**
 * An instance of this class provides access to all the operations defined in QueryParameters.
 */
public final class QueryParametersImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final QueryParametersService service;

    /**
     * The service client containing this operation class.
     */
    private final RoutesClientImpl client;

    /**
     * Initializes an instance of QueryParametersImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    QueryParametersImpl(RoutesClientImpl client) {
        this.service = QueryParametersService.getNewInstance(client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for RoutesClientQueryParameters to be used by the proxy service to
     * perform REST calls.
     */
    @ServiceInterface(name = "RoutesClientQueryPar", host = "{endpoint}")
    public interface QueryParametersService {
        static QueryParametersService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("routes.implementation.QueryParametersServiceImpl");
                return (QueryParametersService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/routes/query/template-only",
            expectedStatusCodes = { 204 })
        @UnexpectedResponseExceptionDetail
        Response<Void> templateOnly(@HostParam("endpoint") String endpoint, @QueryParam("param") String param,
            RequestContext requestContext);

        @HttpRequestInformation(method = HttpMethod.GET, path = "/routes/query/explicit", expectedStatusCodes = { 204 })
        @UnexpectedResponseExceptionDetail
        Response<Void> explicit(@HostParam("endpoint") String endpoint, @QueryParam("param") String param,
            RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/routes/query/annotation-only",
            expectedStatusCodes = { 204 })
        @UnexpectedResponseExceptionDetail
        Response<Void> annotationOnly(@HostParam("endpoint") String endpoint, @QueryParam("param") String param,
            RequestContext requestContext);
    }

    /**
     * The templateOnly operation.
     * 
     * @param param The param parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> templateOnlyWithResponse(String param, RequestContext requestContext) {
        return service.templateOnly(this.client.getEndpoint(), param, requestContext);
    }

    /**
     * The templateOnly operation.
     * 
     * @param param The param parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void templateOnly(String param) {
        templateOnlyWithResponse(param, RequestContext.none());
    }

    /**
     * The explicit operation.
     * 
     * @param param The param parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> explicitWithResponse(String param, RequestContext requestContext) {
        return service.explicit(this.client.getEndpoint(), param, requestContext);
    }

    /**
     * The explicit operation.
     * 
     * @param param The param parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void explicit(String param) {
        explicitWithResponse(param, RequestContext.none());
    }

    /**
     * The annotationOnly operation.
     * 
     * @param param The param parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> annotationOnlyWithResponse(String param, RequestContext requestContext) {
        return service.annotationOnly(this.client.getEndpoint(), param, requestContext);
    }

    /**
     * The annotationOnly operation.
     * 
     * @param param The param parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void annotationOnly(String param) {
        annotationOnlyWithResponse(param, RequestContext.none());
    }
}
