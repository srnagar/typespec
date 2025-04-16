package versioning.renamedfrom.implementation;

import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceInterface;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.annotations.BodyParam;
import io.clientcore.core.http.annotations.HeaderParam;
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
import versioning.renamedfrom.NewModel;
import versioning.renamedfrom.Versions;

/**
 * Initializes a new instance of the RenamedFromClient type.
 */
public final class RenamedFromClientImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final RenamedFromClientService service;

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
     * The NewInterfacesImpl object to access its operations.
     */
    private final NewInterfacesImpl newInterfaces;

    /**
     * Gets the NewInterfacesImpl object to access its operations.
     * 
     * @return the NewInterfacesImpl object.
     */
    public NewInterfacesImpl getNewInterfaces() {
        return this.newInterfaces;
    }

    /**
     * Initializes an instance of RenamedFromClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Need to be set as 'http://localhost:3000' in client.
     * @param version Need to be set as 'v1' or 'v2' in client.
     */
    public RenamedFromClientImpl(HttpPipeline httpPipeline, String endpoint, Versions version) {
        this.httpPipeline = httpPipeline;
        this.endpoint = endpoint;
        this.version = version;
        this.newInterfaces = new NewInterfacesImpl(this);
        this.service = RenamedFromClientService.getNewInstance(this.httpPipeline);
    }

    /**
     * The interface defining all the services for RenamedFromClient to be used by the proxy service to perform REST
     * calls.
     */
    @ServiceInterface(name = "RenamedFromClient", host = "{endpoint}/versioning/renamed-from/api-version:{version}")
    public interface RenamedFromClientService {
        static RenamedFromClientService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("versioning.renamedfrom.implementation.RenamedFromClientServiceImpl");
                return (RenamedFromClientService) clazz.getMethod("getNewInstance", HttpPipeline.class)
                    .invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(method = HttpMethod.POST, path = "/test", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail
        Response<NewModel> newOp(@HostParam("endpoint") String endpoint, @HostParam("version") Versions version,
            @QueryParam("newQuery") String newQuery, @HeaderParam("Content-Type") String contentType,
            @HeaderParam("Accept") String accept, @BodyParam("application/json") NewModel body,
            RequestContext requestContext);
    }

    /**
     * The newOp operation.
     * 
     * @param newQuery The newQuery parameter.
     * @param body The body parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<NewModel> newOpWithResponse(String newQuery, NewModel body, RequestContext requestContext) {
        final String contentType = "application/json";
        final String accept = "application/json";
        return service.newOp(this.getEndpoint(), this.getVersion(), newQuery, contentType, accept, body,
            requestContext);
    }

    /**
     * The newOp operation.
     * 
     * @param newQuery The newQuery parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NewModel newOp(String newQuery, NewModel body) {
        return newOpWithResponse(newQuery, body, RequestContext.none()).getValue();
    }
}
