package type.enumnamespace.extensible.implementation;

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
import type.enumnamespace.extensible.DaysOfWeekExtensibleEnum;

/**
 * An instance of this class provides access to all the operations defined in StringOperations.
 */
public final class StringOperationsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final StringOperationsService service;

    /**
     * The service client containing this operation class.
     */
    private final ExtensibleClientImpl client;

    /**
     * Initializes an instance of StringOperationsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    StringOperationsImpl(ExtensibleClientImpl client) {
        this.service = StringOperationsService.getNewInstance(client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for ExtensibleClientStringOperations to be used by the proxy service to
     * perform REST calls.
     */
    @ServiceInterface(name = "ExtensibleClientStri", host = "{endpoint}")
    public interface StringOperationsService {
        static StringOperationsService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz
                    = Class.forName("type.enumnamespace.extensible.implementation.StringOperationsServiceImpl");
                return (StringOperationsService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/type/enum/extensible/string/known-value",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<DaysOfWeekExtensibleEnum> getKnownValue(@HostParam("endpoint") String endpoint,
            @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/type/enum/extensible/string/unknown-value",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<DaysOfWeekExtensibleEnum> getUnknownValue(@HostParam("endpoint") String endpoint,
            @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.PUT,
            path = "/type/enum/extensible/string/known-value",
            expectedStatusCodes = { 204 })
        @UnexpectedResponseExceptionDetail
        Response<Void> putKnownValue(@HostParam("endpoint") String endpoint,
            @HeaderParam("content-type") String contentType,
            @BodyParam("application/json") DaysOfWeekExtensibleEnum body, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.PUT,
            path = "/type/enum/extensible/string/unknown-value",
            expectedStatusCodes = { 204 })
        @UnexpectedResponseExceptionDetail
        Response<Void> putUnknownValue(@HostParam("endpoint") String endpoint,
            @HeaderParam("content-type") String contentType,
            @BodyParam("application/json") DaysOfWeekExtensibleEnum body, RequestContext requestContext);
    }

    /**
     * The getKnownValue operation.
     * 
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return days of the week.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DaysOfWeekExtensibleEnum> getKnownValueWithResponse(RequestContext requestContext) {
        final String accept = "application/json";
        return service.getKnownValue(this.client.getEndpoint(), accept, requestContext);
    }

    /**
     * The getKnownValue operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return days of the week.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DaysOfWeekExtensibleEnum getKnownValue() {
        return getKnownValueWithResponse(RequestContext.none()).getValue();
    }

    /**
     * The getUnknownValue operation.
     * 
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return days of the week.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DaysOfWeekExtensibleEnum> getUnknownValueWithResponse(RequestContext requestContext) {
        final String accept = "application/json";
        return service.getUnknownValue(this.client.getEndpoint(), accept, requestContext);
    }

    /**
     * The getUnknownValue operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return days of the week.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DaysOfWeekExtensibleEnum getUnknownValue() {
        return getUnknownValueWithResponse(RequestContext.none()).getValue();
    }

    /**
     * The putKnownValue operation.
     * 
     * @param body The body parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putKnownValueWithResponse(DaysOfWeekExtensibleEnum body, RequestContext requestContext) {
        final String contentType = "application/json";
        return service.putKnownValue(this.client.getEndpoint(), contentType, body, requestContext);
    }

    /**
     * The putKnownValue operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putKnownValue(DaysOfWeekExtensibleEnum body) {
        putKnownValueWithResponse(body, RequestContext.none());
    }

    /**
     * The putUnknownValue operation.
     * 
     * @param body The body parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putUnknownValueWithResponse(DaysOfWeekExtensibleEnum body, RequestContext requestContext) {
        final String contentType = "application/json";
        return service.putUnknownValue(this.client.getEndpoint(), contentType, body, requestContext);
    }

    /**
     * The putUnknownValue operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void putUnknownValue(DaysOfWeekExtensibleEnum body) {
        putUnknownValueWithResponse(body, RequestContext.none());
    }
}
