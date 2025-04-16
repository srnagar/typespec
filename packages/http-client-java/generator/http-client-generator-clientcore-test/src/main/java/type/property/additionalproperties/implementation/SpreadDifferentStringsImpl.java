package type.property.additionalproperties.implementation;

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
import type.property.additionalproperties.DifferentSpreadStringRecord;

/**
 * An instance of this class provides access to all the operations defined in SpreadDifferentStrings.
 */
public final class SpreadDifferentStringsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final SpreadDifferentStringsService service;

    /**
     * The service client containing this operation class.
     */
    private final AdditionalPropertiesClientImpl client;

    /**
     * Initializes an instance of SpreadDifferentStringsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    SpreadDifferentStringsImpl(AdditionalPropertiesClientImpl client) {
        this.service = SpreadDifferentStringsService.getNewInstance(client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AdditionalPropertiesClientSpreadDifferentStrings to be used by the
     * proxy service to perform REST calls.
     */
    @ServiceInterface(name = "AdditionalProperties", host = "{endpoint}")
    public interface SpreadDifferentStringsService {
        static SpreadDifferentStringsService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class
                    .forName("type.property.additionalproperties.implementation.SpreadDifferentStringsServiceImpl");
                return (SpreadDifferentStringsService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/type/property/additionalProperties/spreadDifferentRecordString",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<DifferentSpreadStringRecord> get(@HostParam("endpoint") String endpoint,
            @HeaderParam("Accept") String accept, RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.PUT,
            path = "/type/property/additionalProperties/spreadDifferentRecordString",
            expectedStatusCodes = { 204 })
        @UnexpectedResponseExceptionDetail
        Response<Void> put(@HostParam("endpoint") String endpoint, @HeaderParam("Content-Type") String contentType,
            @BodyParam("application/json") DifferentSpreadStringRecord body, RequestContext requestContext);
    }

    /**
     * Get call.
     * 
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DifferentSpreadStringRecord> getWithResponse(RequestContext requestContext) {
        final String accept = "application/json";
        return service.get(this.client.getEndpoint(), accept, requestContext);
    }

    /**
     * Get call.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DifferentSpreadStringRecord get() {
        return getWithResponse(RequestContext.none()).getValue();
    }

    /**
     * Put operation.
     * 
     * @param body body.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putWithResponse(DifferentSpreadStringRecord body, RequestContext requestContext) {
        final String contentType = "application/json";
        return service.put(this.client.getEndpoint(), contentType, body, requestContext);
    }

    /**
     * Put operation.
     * 
     * @param body body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void put(DifferentSpreadStringRecord body) {
        putWithResponse(body, RequestContext.none());
    }
}
