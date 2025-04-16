package parameters.spread.implementation;

import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceInterface;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.annotations.BodyParam;
import io.clientcore.core.http.annotations.HeaderParam;
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
import java.util.List;
import parameters.spread.SpreadAsRequestParameterRequest;
import parameters.spread.SpreadParameterWithInnerAliasRequest;
import parameters.spread.SpreadParameterWithInnerModelRequest;
import parameters.spread.SpreadWithMultipleParametersRequest;
import parameters.spread.alias.SpreadAsRequestBodyRequest;

/**
 * An instance of this class provides access to all the operations defined in Alias.
 */
public final class AliasImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final AliasService service;

    /**
     * The service client containing this operation class.
     */
    private final SpreadClientImpl client;

    /**
     * Initializes an instance of AliasImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    AliasImpl(SpreadClientImpl client) {
        this.service = AliasService.getNewInstance(client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for SpreadClientAlias to be used by the proxy service to perform REST
     * calls.
     */
    @ServiceInterface(name = "SpreadClientAlias", host = "{endpoint}")
    public interface AliasService {
        static AliasService getNewInstance(HttpPipeline pipeline) {
            try {
                Class<?> clazz = Class.forName("parameters.spread.implementation.AliasServiceImpl");
                return (AliasService) clazz.getMethod("getNewInstance", HttpPipeline.class).invoke(null, pipeline);
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
                | InvocationTargetException e) {
                throw new RuntimeException(e);
            }

        }

        @HttpRequestInformation(
            method = HttpMethod.PUT,
            path = "/parameters/spread/alias/request-body",
            expectedStatusCodes = { 204 })
        @UnexpectedResponseExceptionDetail
        Response<Void> spreadAsRequestBody(@HostParam("endpoint") String endpoint,
            @HeaderParam("Content-Type") String contentType,
            @BodyParam("application/json") SpreadAsRequestBodyRequest spreadAsRequestBodyRequest,
            RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/parameters/spread/alias/inner-model-parameter/{id}",
            expectedStatusCodes = { 204 })
        @UnexpectedResponseExceptionDetail
        Response<Void> spreadParameterWithInnerModel(@HostParam("endpoint") String endpoint, @PathParam("id") String id,
            @HeaderParam("x-ms-test-header") String xMsTestHeader, @HeaderParam("Content-Type") String contentType,
            @BodyParam("application/json") SpreadParameterWithInnerModelRequest spreadParameterWithInnerModelRequest,
            RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.PUT,
            path = "/parameters/spread/alias/request-parameter/{id}",
            expectedStatusCodes = { 204 })
        @UnexpectedResponseExceptionDetail
        Response<Void> spreadAsRequestParameter(@HostParam("endpoint") String endpoint, @PathParam("id") String id,
            @HeaderParam("x-ms-test-header") String xMsTestHeader, @HeaderParam("Content-Type") String contentType,
            @BodyParam("application/json") SpreadAsRequestParameterRequest spreadAsRequestParameterRequest,
            RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.PUT,
            path = "/parameters/spread/alias/multiple-parameters/{id}",
            expectedStatusCodes = { 204 })
        @UnexpectedResponseExceptionDetail
        Response<Void> spreadWithMultipleParameters(@HostParam("endpoint") String endpoint, @PathParam("id") String id,
            @HeaderParam("x-ms-test-header") String xMsTestHeader, @HeaderParam("Content-Type") String contentType,
            @BodyParam("application/json") SpreadWithMultipleParametersRequest spreadWithMultipleParametersRequest,
            RequestContext requestContext);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/parameters/spread/alias/inner-alias-parameter/{id}",
            expectedStatusCodes = { 204 })
        @UnexpectedResponseExceptionDetail
        Response<Void> spreadParameterWithInnerAlias(@HostParam("endpoint") String endpoint, @PathParam("id") String id,
            @HeaderParam("x-ms-test-header") String xMsTestHeader, @HeaderParam("Content-Type") String contentType,
            @BodyParam("application/json") SpreadParameterWithInnerAliasRequest spreadParameterWithInnerAliasRequest,
            RequestContext requestContext);
    }

    /**
     * The spreadAsRequestBody operation.
     * 
     * @param name The name parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> spreadAsRequestBodyWithResponse(String name, RequestContext requestContext) {
        final String contentType = "application/json";
        SpreadAsRequestBodyRequest spreadAsRequestBodyRequest = new SpreadAsRequestBodyRequest(name);
        return service.spreadAsRequestBody(this.client.getEndpoint(), contentType, spreadAsRequestBodyRequest,
            requestContext);
    }

    /**
     * The spreadAsRequestBody operation.
     * 
     * @param name The name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void spreadAsRequestBody(String name) {
        spreadAsRequestBodyWithResponse(name, RequestContext.none());
    }

    /**
     * The spreadParameterWithInnerModel operation.
     * 
     * @param id The id parameter.
     * @param xMsTestHeader The xMsTestHeader parameter.
     * @param name The name parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> spreadParameterWithInnerModelWithResponse(String id, String xMsTestHeader, String name,
        RequestContext requestContext) {
        final String contentType = "application/json";
        SpreadParameterWithInnerModelRequest spreadParameterWithInnerModelRequest
            = new SpreadParameterWithInnerModelRequest(name);
        return service.spreadParameterWithInnerModel(this.client.getEndpoint(), id, xMsTestHeader, contentType,
            spreadParameterWithInnerModelRequest, requestContext);
    }

    /**
     * The spreadParameterWithInnerModel operation.
     * 
     * @param id The id parameter.
     * @param xMsTestHeader The xMsTestHeader parameter.
     * @param name The name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void spreadParameterWithInnerModel(String id, String xMsTestHeader, String name) {
        spreadParameterWithInnerModelWithResponse(id, xMsTestHeader, name, RequestContext.none());
    }

    /**
     * The spreadAsRequestParameter operation.
     * 
     * @param id The id parameter.
     * @param xMsTestHeader The xMsTestHeader parameter.
     * @param name The name parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> spreadAsRequestParameterWithResponse(String id, String xMsTestHeader, String name,
        RequestContext requestContext) {
        final String contentType = "application/json";
        SpreadAsRequestParameterRequest spreadAsRequestParameterRequest = new SpreadAsRequestParameterRequest(name);
        return service.spreadAsRequestParameter(this.client.getEndpoint(), id, xMsTestHeader, contentType,
            spreadAsRequestParameterRequest, requestContext);
    }

    /**
     * The spreadAsRequestParameter operation.
     * 
     * @param id The id parameter.
     * @param xMsTestHeader The xMsTestHeader parameter.
     * @param name The name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void spreadAsRequestParameter(String id, String xMsTestHeader, String name) {
        spreadAsRequestParameterWithResponse(id, xMsTestHeader, name, RequestContext.none());
    }

    /**
     * The spreadWithMultipleParameters operation.
     * 
     * @param id The id parameter.
     * @param xMsTestHeader The xMsTestHeader parameter.
     * @param requiredString required string.
     * @param requiredIntList required int.
     * @param optionalInt optional int.
     * @param optionalStringList optional string.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> spreadWithMultipleParametersWithResponse(String id, String xMsTestHeader,
        String requiredString, List<Integer> requiredIntList, Integer optionalInt, List<String> optionalStringList,
        RequestContext requestContext) {
        final String contentType = "application/json";
        SpreadWithMultipleParametersRequest spreadWithMultipleParametersRequest
            = new SpreadWithMultipleParametersRequest(requiredString, requiredIntList);
        spreadWithMultipleParametersRequest.setOptionalInt(optionalInt);
        spreadWithMultipleParametersRequest.setOptionalStringList(optionalStringList);
        return service.spreadWithMultipleParameters(this.client.getEndpoint(), id, xMsTestHeader, contentType,
            spreadWithMultipleParametersRequest, requestContext);
    }

    /**
     * The spreadWithMultipleParameters operation.
     * 
     * @param id The id parameter.
     * @param xMsTestHeader The xMsTestHeader parameter.
     * @param requiredString required string.
     * @param requiredIntList required int.
     * @param optionalInt optional int.
     * @param optionalStringList optional string.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void spreadWithMultipleParameters(String id, String xMsTestHeader, String requiredString,
        List<Integer> requiredIntList, Integer optionalInt, List<String> optionalStringList) {
        spreadWithMultipleParametersWithResponse(id, xMsTestHeader, requiredString, requiredIntList, optionalInt,
            optionalStringList, RequestContext.none());
    }

    /**
     * The spreadWithMultipleParameters operation.
     * 
     * @param id The id parameter.
     * @param xMsTestHeader The xMsTestHeader parameter.
     * @param requiredString required string.
     * @param requiredIntList required int.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void spreadWithMultipleParameters(String id, String xMsTestHeader, String requiredString,
        List<Integer> requiredIntList) {
        final Integer optionalInt = null;
        final List<String> optionalStringList = null;
        spreadWithMultipleParametersWithResponse(id, xMsTestHeader, requiredString, requiredIntList, optionalInt,
            optionalStringList, RequestContext.none());
    }

    /**
     * spread an alias with contains another alias property as body.
     * 
     * @param id The id parameter.
     * @param xMsTestHeader The xMsTestHeader parameter.
     * @param name name of the Thing.
     * @param age age of the Thing.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> spreadParameterWithInnerAliasWithResponse(String id, String xMsTestHeader, String name,
        int age, RequestContext requestContext) {
        final String contentType = "application/json";
        SpreadParameterWithInnerAliasRequest spreadParameterWithInnerAliasRequest
            = new SpreadParameterWithInnerAliasRequest(name, age);
        return service.spreadParameterWithInnerAlias(this.client.getEndpoint(), id, xMsTestHeader, contentType,
            spreadParameterWithInnerAliasRequest, requestContext);
    }

    /**
     * spread an alias with contains another alias property as body.
     * 
     * @param id The id parameter.
     * @param xMsTestHeader The xMsTestHeader parameter.
     * @param name name of the Thing.
     * @param age age of the Thing.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void spreadParameterWithInnerAlias(String id, String xMsTestHeader, String name, int age) {
        spreadParameterWithInnerAliasWithResponse(id, xMsTestHeader, name, age, RequestContext.none());
    }
}
