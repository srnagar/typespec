package parameters.bodyoptionality.implementation;

import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceInterface;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.annotations.BodyParam;
import io.clientcore.core.http.annotations.HostParam;
import io.clientcore.core.http.annotations.HttpRequestInformation;
import io.clientcore.core.http.annotations.UnexpectedResponseExceptionDetail;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.http.pipeline.HttpPipeline;
import java.lang.reflect.InvocationTargetException;
import parameters.bodyoptionality.BodyModel;

/**
 * An instance of this class provides access to all the operations defined in OptionalExplicits.
 */
public final class OptionalExplicitsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final OptionalExplicitsService service;

    /**
     * The service client containing this operation class.
     */
    private final BodyOptionalityClientImpl client;

    /**
     * Initializes an instance of OptionalExplicitsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    OptionalExplicitsImpl(BodyOptionalityClientImpl client) {
        this.service = OptionalExplicitsService.getNewInstance(client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for BodyOptionalityClientOptionalExplicits to be used by the proxy
     * service to perform REST calls.
     */
    @ServiceInterface(name = "BodyOptionalityClien", host = "{endpoint}")
    public interface OptionalExplicitsService {
        static OptionalExplicitsService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz
                    = Class.forName("parameters.bodyoptionality.implementation.OptionalExplicitsServiceImpl");
                return (OptionalExplicitsService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/parameters/body-optionality/optional-explicit/set",
            expectedStatusCodes = { 204 })
        @UnexpectedResponseExceptionDetail
        Response<Void> set(@HostParam("endpoint") String endpoint, @BodyParam("application/json") BodyModel body,
            RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/parameters/body-optionality/optional-explicit/omit",
            expectedStatusCodes = { 204 })
        @UnexpectedResponseExceptionDetail
        Response<Void> omit(@HostParam("endpoint") String endpoint, @BodyParam("application/json") BodyModel body,
            RequestContext requestContext);
    }

    /**
     * The set operation.
     * 
     * @param body The body parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> setWithResponse(BodyModel body, RequestContext requestContext) {
        return service.set(this.client.getEndpoint(), body, requestContext);
    }

    /**
     * The set operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void set(BodyModel body) {
        setWithResponse(body, RequestContext.none());
    }

    /**
     * The set operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void set() {
        final BodyModel body = null;
        setWithResponse(body, RequestContext.none());
    }

    /**
     * The omit operation.
     * 
     * @param body The body parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> omitWithResponse(BodyModel body, RequestContext requestContext) {
        return service.omit(this.client.getEndpoint(), body, requestContext);
    }

    /**
     * The omit operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void omit(BodyModel body) {
        omitWithResponse(body, RequestContext.none());
    }

    /**
     * The omit operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void omit() {
        final BodyModel body = null;
        omitWithResponse(body, RequestContext.none());
    }
}
