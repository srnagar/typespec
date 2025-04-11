package type.model.empty.implementation;

import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceInterface;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.annotations.BodyParam;
import io.clientcore.core.http.annotations.HeaderParam;
import io.clientcore.core.http.annotations.HostParam;
import io.clientcore.core.http.annotations.HttpRequestInformation;
import io.clientcore.core.http.annotations.UnexpectedResponseExceptionDetail;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.http.pipeline.HttpPipeline;
import java.lang.reflect.InvocationTargetException;

/**
 * Initializes a new instance of the EmptyClient type.
 */
public final class EmptyClientImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final EmptyClientService service;

    /**
     * Service host.
     */
    private final String endpoint;

    /**
     * Gets Service host.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * Initializes an instance of EmptyClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Service host.
     */
    public EmptyClientImpl(HttpPipeline httpPipeline, String endpoint) {
        this.httpPipeline = httpPipeline;
        this.endpoint = endpoint;
        this.service = EmptyClientService.getNewInstance(this.httpPipeline);
    }

    /**
     * The interface defining all the services for EmptyClient to be used by the proxy service to perform REST calls.
     */
    @ServiceInterface(name = "EmptyClient", host = "{endpoint}")
    public interface EmptyClientService {
        static EmptyClientService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("type.model.empty.implementation.EmptyClientServiceImpl");
                return (EmptyClientService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.PUT,
            path = "/type/model/empty/alone",
            expectedStatusCodes = { 204 })
        @UnexpectedResponseExceptionDetail
        Response<Void> putEmpty(@HostParam("endpoint") String endpoint, @HeaderParam("Content-Type") String contentType,
            @BodyParam("application/json") Object input, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/type/model/empty/alone",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<Object> getEmpty(@HostParam("endpoint") String endpoint, @HeaderParam("Accept") String accept,
            RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/type/model/empty/round-trip",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<Object> postRoundTripEmpty(@HostParam("endpoint") String endpoint,
            @HeaderParam("Content-Type") String contentType, @HeaderParam("Accept") String accept,
            @BodyParam("application/json") Object body, RequestContext requestContext);
    }

    /**
     * The putEmpty operation.
     * 
     * @param input The input parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putEmptyWithResponse(Object input, RequestContext requestContext) {
        final String contentType = "application/json";
        return service.putEmpty(this.getEndpoint(), contentType, input, requestContext);
    }

    /**
     * The putEmpty operation.
     * 
     * @param input The input parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putEmpty(Object input) {
        putEmptyWithResponse(input, RequestContext.none());
    }

    /**
     * The getEmpty operation.
     * 
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return empty model used in operation return type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Object> getEmptyWithResponse(RequestContext requestContext) {
        final String accept = "application/json";
        return service.getEmpty(this.getEndpoint(), accept, requestContext);
    }

    /**
     * The getEmpty operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return empty model used in operation return type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getEmpty() {
        return getEmptyWithResponse(RequestContext.none()).getValue();
    }

    /**
     * The postRoundTripEmpty operation.
     * 
     * @param body The body parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return empty model used in both parameter and return type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Object> postRoundTripEmptyWithResponse(Object body, RequestContext requestContext) {
        final String contentType = "application/json";
        final String accept = "application/json";
        return service.postRoundTripEmpty(this.getEndpoint(), contentType, accept, body, requestContext);
    }

    /**
     * The postRoundTripEmpty operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return empty model used in both parameter and return type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object postRoundTripEmpty(Object body) {
        return postRoundTripEmptyWithResponse(body, RequestContext.none()).getValue();
    }
}
