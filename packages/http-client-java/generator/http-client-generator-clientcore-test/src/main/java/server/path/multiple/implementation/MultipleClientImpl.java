package server.path.multiple.implementation;

import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceInterface;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.annotations.HostParam;
import io.clientcore.core.http.annotations.HttpRequestInformation;
import io.clientcore.core.http.annotations.PathParam;
import io.clientcore.core.http.annotations.UnexpectedResponseExceptionDetail;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.http.pipeline.HttpPipeline;
import java.lang.reflect.InvocationTargetException;

/**
 * Initializes a new instance of the MultipleClient type.
 */
public final class MultipleClientImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final MultipleClientService service;

    /**
     * Pass in http://localhost:3000 for endpoint.
     */
    private final String endpoint;

    /**
     * Gets Pass in http://localhost:3000 for endpoint.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Version parameter.
     */
    private final String apiVersion;

    /**
     * Gets Version parameter.
     * 
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
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
     * Initializes an instance of MultipleClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Pass in http://localhost:3000 for endpoint.
     * @param apiVersion Version parameter.
     */
    public MultipleClientImpl(HttpPipeline httpPipeline, String endpoint, String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
        this.service = MultipleClientService.getNewInstance(this.httpPipeline);
    }

    /**
     * The interface defining all the services for MultipleClient to be used by the proxy service to perform REST calls.
     */
    @ServiceInterface(name = "MultipleClient", host = "{endpoint}/server/path/multiple/{apiVersion}")
    public interface MultipleClientService {
        static MultipleClientService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("server.path.multiple.implementation.MultipleClientServiceImpl");
                return (MultipleClientService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(method = HttpMethod.GET, path = "/", expectedStatusCodes = { 204 })
        @UnexpectedResponseExceptionDetail
        Response<Void> noOperationParams(@HostParam("endpoint") String endpoint,
            @HostParam("apiVersion") String apiVersion, RequestContext requestContext);

        @HttpRequestInformation(method = HttpMethod.GET, path = "/{keyword}", expectedStatusCodes = { 204 })
        @UnexpectedResponseExceptionDetail
        Response<Void> withOperationPathParam(@HostParam("endpoint") String endpoint,
            @HostParam("apiVersion") String apiVersion, @PathParam("keyword") String keyword,
            RequestContext requestContext);
    }

    /**
     * The noOperationParams operation.
     * 
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> noOperationParamsWithResponse(RequestContext requestContext) {
        return service.noOperationParams(this.getEndpoint(), this.getApiVersion(), requestContext);
    }

    /**
     * The noOperationParams operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void noOperationParams() {
        noOperationParamsWithResponse(RequestContext.none());
    }

    /**
     * The withOperationPathParam operation.
     * 
     * @param keyword The keyword parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> withOperationPathParamWithResponse(String keyword, RequestContext requestContext) {
        return service.withOperationPathParam(this.getEndpoint(), this.getApiVersion(), keyword, requestContext);
    }

    /**
     * The withOperationPathParam operation.
     * 
     * @param keyword The keyword parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void withOperationPathParam(String keyword) {
        withOperationPathParamWithResponse(keyword, RequestContext.none());
    }
}
