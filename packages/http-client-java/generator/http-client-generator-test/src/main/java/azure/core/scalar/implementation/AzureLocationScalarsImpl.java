// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package azure.core.scalar.implementation;

import azure.core.scalar.ScalarServiceVersion;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in AzureLocationScalars.
 */
public final class AzureLocationScalarsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final AzureLocationScalarsService service;

    /**
     * The service client containing this operation class.
     */
    private final ScalarClientImpl client;

    /**
     * Initializes an instance of AzureLocationScalarsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    AzureLocationScalarsImpl(ScalarClientImpl client) {
        this.service = RestProxy.create(AzureLocationScalarsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public ScalarServiceVersion getServiceVersion() {
        return client.getServiceVersion();
    }

    /**
     * The interface defining all the services for ScalarClientAzureLocationScalars to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ScalarClientAzureLoc")
    public interface AzureLocationScalarsService {
        @Get("/azure/core/scalar/azureLocation")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> get(@HostParam("endpoint") String endpoint, @HeaderParam("Accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/azure/core/scalar/azureLocation")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> getSync(@HostParam("endpoint") String endpoint, @HeaderParam("Accept") String accept,
            RequestOptions requestOptions, Context context);

        @Put("/azure/core/scalar/azureLocation")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> put(@HostParam("endpoint") String endpoint,
            @HeaderParam("content-type") String contentType, @BodyParam("application/json") BinaryData body,
            RequestOptions requestOptions, Context context);

        @Put("/azure/core/scalar/azureLocation")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> putSync(@HostParam("endpoint") String endpoint, @HeaderParam("content-type") String contentType,
            @BodyParam("application/json") BinaryData body, RequestOptions requestOptions, Context context);

        @Post("/azure/core/scalar/azureLocation")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> post(@HostParam("endpoint") String endpoint,
            @HeaderParam("content-type") String contentType, @HeaderParam("Accept") String accept,
            @BodyParam("application/json") BinaryData body, RequestOptions requestOptions, Context context);

        @Post("/azure/core/scalar/azureLocation")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> postSync(@HostParam("endpoint") String endpoint,
            @HeaderParam("content-type") String contentType, @HeaderParam("Accept") String accept,
            @BodyParam("application/json") BinaryData body, RequestOptions requestOptions, Context context);

        @Post("/azure/core/scalar/azureLocation/header")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> headerMethod(@HostParam("endpoint") String endpoint, @HeaderParam("region") String region,
            RequestOptions requestOptions, Context context);

        @Post("/azure/core/scalar/azureLocation/header")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> headerMethodSync(@HostParam("endpoint") String endpoint, @HeaderParam("region") String region,
            RequestOptions requestOptions, Context context);

        @Post("/azure/core/scalar/azureLocation/query")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> query(@HostParam("endpoint") String endpoint, @QueryParam("region") String region,
            RequestOptions requestOptions, Context context);

        @Post("/azure/core/scalar/azureLocation/query")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> querySync(@HostParam("endpoint") String endpoint, @QueryParam("region") String region,
            RequestOptions requestOptions, Context context);
    }

    /**
     * get azureLocation value.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * String
     * }
     * </pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return azureLocation value along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.get(this.client.getEndpoint(), accept, requestOptions, context));
    }

    /**
     * get azureLocation value.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * String
     * }
     * </pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return azureLocation value along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getSync(this.client.getEndpoint(), accept, requestOptions, Context.NONE);
    }

    /**
     * put azureLocation value.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * String
     * }
     * </pre>
     * 
     * @param body _.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> putWithResponseAsync(BinaryData body, RequestOptions requestOptions) {
        final String contentType = "application/json";
        return FluxUtil
            .withContext(context -> service.put(this.client.getEndpoint(), contentType, body, requestOptions, context));
    }

    /**
     * put azureLocation value.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * String
     * }
     * </pre>
     * 
     * @param body _.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> putWithResponse(BinaryData body, RequestOptions requestOptions) {
        final String contentType = "application/json";
        return service.putSync(this.client.getEndpoint(), contentType, body, requestOptions, Context.NONE);
    }

    /**
     * post a model which has azureLocation property.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     location: String (Required)
     * }
     * }
     * </pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     location: String (Required)
     * }
     * }
     * </pre>
     * 
     * @param body _.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> postWithResponseAsync(BinaryData body, RequestOptions requestOptions) {
        final String contentType = "application/json";
        final String accept = "application/json";
        return FluxUtil.withContext(
            context -> service.post(this.client.getEndpoint(), contentType, accept, body, requestOptions, context));
    }

    /**
     * post a model which has azureLocation property.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     location: String (Required)
     * }
     * }
     * </pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     location: String (Required)
     * }
     * }
     * </pre>
     * 
     * @param body _.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> postWithResponse(BinaryData body, RequestOptions requestOptions) {
        final String contentType = "application/json";
        final String accept = "application/json";
        return service.postSync(this.client.getEndpoint(), contentType, accept, body, requestOptions, Context.NONE);
    }

    /**
     * azureLocation value header.
     * 
     * @param region _.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> headerMethodWithResponseAsync(String region, RequestOptions requestOptions) {
        return FluxUtil
            .withContext(context -> service.headerMethod(this.client.getEndpoint(), region, requestOptions, context));
    }

    /**
     * azureLocation value header.
     * 
     * @param region _.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> headerMethodWithResponse(String region, RequestOptions requestOptions) {
        return service.headerMethodSync(this.client.getEndpoint(), region, requestOptions, Context.NONE);
    }

    /**
     * azureLocation value query.
     * 
     * @param region _.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> queryWithResponseAsync(String region, RequestOptions requestOptions) {
        return FluxUtil
            .withContext(context -> service.query(this.client.getEndpoint(), region, requestOptions, context));
    }

    /**
     * azureLocation value query.
     * 
     * @param region _.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> queryWithResponse(String region, RequestOptions requestOptions) {
        return service.querySync(this.client.getEndpoint(), region, requestOptions, Context.NONE);
    }
}
