// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package type.scalar.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Put;
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
 * An instance of this class provides access to all the operations defined in BooleanOperations.
 */
public final class BooleanOperationsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final BooleanOperationsService service;

    /**
     * The service client containing this operation class.
     */
    private final ScalarClientImpl client;

    /**
     * Initializes an instance of BooleanOperationsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    BooleanOperationsImpl(ScalarClientImpl client) {
        this.service
            = RestProxy.create(BooleanOperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ScalarClientBooleanOperations to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ScalarClientBooleanO")
    public interface BooleanOperationsService {
        @Get("/type/scalar/boolean")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> get(@HostParam("endpoint") String endpoint, @HeaderParam("Accept") String accept,
            RequestOptions requestOptions, Context context);

        @Get("/type/scalar/boolean")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> getSync(@HostParam("endpoint") String endpoint, @HeaderParam("Accept") String accept,
            RequestOptions requestOptions, Context context);

        @Put("/type/scalar/boolean")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> put(@HostParam("endpoint") String endpoint,
            @HeaderParam("content-type") String contentType, @BodyParam("application/json") BinaryData body,
            RequestOptions requestOptions, Context context);

        @Put("/type/scalar/boolean")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> putSync(@HostParam("endpoint") String endpoint, @HeaderParam("content-type") String contentType,
            @BodyParam("application/json") BinaryData body, RequestOptions requestOptions, Context context);
    }

    /**
     * get boolean value.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * boolean
     * }
     * </pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return boolean value along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.get(this.client.getEndpoint(), accept, requestOptions, context));
    }

    /**
     * get boolean value.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * boolean
     * }
     * </pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return boolean value along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getSync(this.client.getEndpoint(), accept, requestOptions, Context.NONE);
    }

    /**
     * put boolean value.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * boolean
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
     * put boolean value.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * boolean
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
}
