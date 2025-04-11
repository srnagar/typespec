package versioning.returntypechangedfrom.implementation;

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
import versioning.returntypechangedfrom.Versions;

/**
 * Initializes a new instance of the ReturnTypeChangedFromClient type.
 */
public final class ReturnTypeChangedFromClientImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ReturnTypeChangedFromClientService service;

    /**
     * Need to be set as 'http://localhost:3000' in client.
     */
    private final String endpoint;

    /**
     * Gets Need to be set as 'http://localhost:3000' in client.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Need to be set as 'v1' or 'v2' in client.
     */
    private final Versions version;

    /**
     * Gets Need to be set as 'v1' or 'v2' in client.
     * 
     * @return the version value.
     */
    public Versions getVersion() {
        return this.version;
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
     * Initializes an instance of ReturnTypeChangedFromClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Need to be set as 'http://localhost:3000' in client.
     * @param version Need to be set as 'v1' or 'v2' in client.
     */
    public ReturnTypeChangedFromClientImpl(HttpPipeline httpPipeline, String endpoint, Versions version) {
        this.httpPipeline = httpPipeline;
        this.endpoint = endpoint;
        this.version = version;
        this.service = ReturnTypeChangedFromClientService.getNewInstance(this.httpPipeline);
    }

    /**
     * The interface defining all the services for ReturnTypeChangedFromClient to be used by the proxy service to
     * perform REST calls.
     */
    @ServiceInterface(
        name = "ReturnTypeChangedFro",
        host = "{endpoint}/versioning/return-type-changed-from/api-version:{version}")
    public interface ReturnTypeChangedFromClientService {
        static ReturnTypeChangedFromClientService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class
                    .forName("versioning.returntypechangedfrom.implementation.ReturnTypeChangedFromClientServiceImpl");
                return (ReturnTypeChangedFromClientService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(method = HttpMethod.POST, path = "/test", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<String> test(@HostParam("endpoint") String endpoint, @HostParam("version") Versions version,
            @HeaderParam("content-type") String contentType, @HeaderParam("Accept") String accept,
            @BodyParam("application/json") String body, RequestContext requestContext);
    }

    /**
     * The test operation.
     * 
     * @param body The body parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sequence of textual characters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<String> testWithResponse(String body, RequestContext requestContext) {
        final String contentType = "application/json";
        final String accept = "application/json";
        return service.test(this.getEndpoint(), this.getVersion(), contentType, accept, body, requestContext);
    }

    /**
     * The test operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sequence of textual characters.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public String test(String body) {
        return testWithResponse(body, RequestContext.none()).getValue();
    }
}
