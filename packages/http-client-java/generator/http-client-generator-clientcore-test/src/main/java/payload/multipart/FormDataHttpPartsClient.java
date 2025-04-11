package payload.multipart;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.annotations.ReturnType;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.annotations.ServiceMethod;
import io.clientcore.core.http.models.HttpResponseException;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;
import payload.multipart.implementation.FormDataHttpPartsImpl;

/**
 * Initializes a new instance of the synchronous MultiPartClient type.
 */
@ServiceClient(builder = MultiPartClientBuilder.class)
public final class FormDataHttpPartsClient {
    @Metadata(properties = { MetadataProperties.GENERATED })
    private final FormDataHttpPartsImpl serviceClient;

    /**
     * Initializes an instance of FormDataHttpPartsClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    FormDataHttpPartsClient(FormDataHttpPartsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Test content-type: multipart/form-data for mixed scenarios.
     * 
     * @param body The body parameter.
     * @param requestContext The context to configure the HTTP request before HTTP client sends it.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> jsonArrayAndFileArrayWithResponse(ComplexHttpPartsModelRequest body,
        RequestContext requestContext) {
        // Operation 'jsonArrayAndFileArray' is of content-type 'multipart/form-data'. Protocol API is not usable and
        // hence not generated.
        return this.serviceClient.jsonArrayAndFileArrayWithResponse(body, requestContext);
    }

    /**
     * Test content-type: multipart/form-data for mixed scenarios.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void jsonArrayAndFileArray(ComplexHttpPartsModelRequest body) {
        // Operation 'jsonArrayAndFileArray' is of content-type 'multipart/form-data'. Protocol API is not usable and
        // hence not generated.
        this.serviceClient.jsonArrayAndFileArray(body);
    }
}
