package payload.multipart;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.http.exceptions.HttpResponseException;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.models.binarydata.BinaryData;
import java.util.stream.Collectors;
import payload.multipart.formdata.AnonymousModelRequest;
import payload.multipart.implementation.FormDatasImpl;
import payload.multipart.implementation.MultipartFormDataHelper;

/**
 * Initializes a new instance of the synchronous MultiPartClient type.
 */
@ServiceClient(builder = MultiPartClientBuilder.class)
public final class FormDataClient {
    @Metadata(generated = true)
    private final FormDatasImpl serviceClient;

    /**
     * Initializes an instance of FormDataClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(generated = true)
    FormDataClient(FormDatasImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Test content-type: multipart/form-data.
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    Response<Void> basicWithResponse(BinaryData body, RequestOptions requestOptions) {
        // Operation 'basic' is of content-type 'multipart/form-data'. Protocol API is not usable and hence not
        // generated.
        return this.serviceClient.basicWithResponse(body, requestOptions);
    }

    /**
     * Test content-type: multipart/form-data for mixed scenarios.
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    Response<Void> fileArrayAndBasicWithResponse(BinaryData body, RequestOptions requestOptions) {
        // Operation 'fileArrayAndBasic' is of content-type 'multipart/form-data'. Protocol API is not usable and hence
        // not generated.
        return this.serviceClient.fileArrayAndBasicWithResponse(body, requestOptions);
    }

    /**
     * Test content-type: multipart/form-data for scenario contains json part and binary part.
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    Response<Void> jsonPartWithResponse(BinaryData body, RequestOptions requestOptions) {
        // Operation 'jsonPart' is of content-type 'multipart/form-data'. Protocol API is not usable and hence not
        // generated.
        return this.serviceClient.jsonPartWithResponse(body, requestOptions);
    }

    /**
     * Test content-type: multipart/form-data for scenario contains multi binary parts.
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    Response<Void> binaryArrayPartsWithResponse(BinaryData body, RequestOptions requestOptions) {
        // Operation 'binaryArrayParts' is of content-type 'multipart/form-data'. Protocol API is not usable and hence
        // not generated.
        return this.serviceClient.binaryArrayPartsWithResponse(body, requestOptions);
    }

    /**
     * Test content-type: multipart/form-data for scenario contains multi binary parts.
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    Response<Void> multiBinaryPartsWithResponse(BinaryData body, RequestOptions requestOptions) {
        // Operation 'multiBinaryParts' is of content-type 'multipart/form-data'. Protocol API is not usable and hence
        // not generated.
        return this.serviceClient.multiBinaryPartsWithResponse(body, requestOptions);
    }

    /**
     * Test content-type: multipart/form-data.
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    Response<Void> checkFileNameAndContentTypeWithResponse(BinaryData body, RequestOptions requestOptions) {
        // Operation 'checkFileNameAndContentType' is of content-type 'multipart/form-data'. Protocol API is not usable
        // and hence not generated.
        return this.serviceClient.checkFileNameAndContentTypeWithResponse(body, requestOptions);
    }

    /**
     * Test content-type: multipart/form-data.
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    Response<Void> anonymousModelWithResponse(BinaryData body, RequestOptions requestOptions) {
        // Operation 'anonymousModel' is of content-type 'multipart/form-data'. Protocol API is not usable and hence not
        // generated.
        return this.serviceClient.anonymousModelWithResponse(body, requestOptions);
    }

    /**
     * Test content-type: multipart/form-data.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void basic(MultiPartRequest body) {
        // Generated convenience method for basicWithResponse
        RequestOptions requestOptions = new RequestOptions();
        basicWithResponse(new MultipartFormDataHelper(requestOptions).serializeTextField("id", body.getId())
            .serializeFileField("profileImage", body.getProfileImage().getContent(),
                body.getProfileImage().getContentType(), body.getProfileImage().getFilename())
            .end()
            .getRequestBody(), requestOptions).getValue();
    }

    /**
     * Test content-type: multipart/form-data for mixed scenarios.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void fileArrayAndBasic(ComplexPartsRequest body) {
        // Generated convenience method for fileArrayAndBasicWithResponse
        RequestOptions requestOptions = new RequestOptions();
        fileArrayAndBasicWithResponse(new MultipartFormDataHelper(requestOptions).serializeTextField("id", body.getId())
            .serializeJsonField("address", body.getAddress())
            .serializeFileField("profileImage", body.getProfileImage().getContent(),
                body.getProfileImage().getContentType(), body.getProfileImage().getFilename())
            .serializeFileFields("pictures",
                body.getPictures().stream().map(PicturesFileDetails::getContent).collect(Collectors.toList()),
                body.getPictures().stream().map(PicturesFileDetails::getContentType).collect(Collectors.toList()),
                body.getPictures().stream().map(PicturesFileDetails::getFilename).collect(Collectors.toList()))
            .end()
            .getRequestBody(), requestOptions).getValue();
    }

    /**
     * Test content-type: multipart/form-data for scenario contains json part and binary part.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void jsonPart(JsonPartRequest body) {
        // Generated convenience method for jsonPartWithResponse
        RequestOptions requestOptions = new RequestOptions();
        jsonPartWithResponse(
            new MultipartFormDataHelper(requestOptions).serializeJsonField("address", body.getAddress())
                .serializeFileField("profileImage", body.getProfileImage().getContent(),
                    body.getProfileImage().getContentType(), body.getProfileImage().getFilename())
                .end()
                .getRequestBody(),
            requestOptions).getValue();
    }

    /**
     * Test content-type: multipart/form-data for scenario contains multi binary parts.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void binaryArrayParts(BinaryArrayPartsRequest body) {
        // Generated convenience method for binaryArrayPartsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        binaryArrayPartsWithResponse(new MultipartFormDataHelper(requestOptions).serializeTextField("id", body.getId())
            .serializeFileFields("pictures",
                body.getPictures().stream().map(PicturesFileDetails::getContent).collect(Collectors.toList()),
                body.getPictures().stream().map(PicturesFileDetails::getContentType).collect(Collectors.toList()),
                body.getPictures().stream().map(PicturesFileDetails::getFilename).collect(Collectors.toList()))
            .end()
            .getRequestBody(), requestOptions).getValue();
    }

    /**
     * Test content-type: multipart/form-data for scenario contains multi binary parts.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void multiBinaryParts(MultiBinaryPartsRequest body) {
        // Generated convenience method for multiBinaryPartsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        multiBinaryPartsWithResponse(new MultipartFormDataHelper(requestOptions)
            .serializeFileField("profileImage", body.getProfileImage().getContent(),
                body.getProfileImage().getContentType(), body.getProfileImage().getFilename())
            .serializeFileField("picture", body.getPicture() == null ? null : body.getPicture().getContent(),
                body.getPicture() == null ? null : body.getPicture().getContentType(),
                body.getPicture() == null ? null : body.getPicture().getFilename())
            .end()
            .getRequestBody(), requestOptions).getValue();
    }

    /**
     * Test content-type: multipart/form-data.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void checkFileNameAndContentType(MultiPartRequest body) {
        // Generated convenience method for checkFileNameAndContentTypeWithResponse
        RequestOptions requestOptions = new RequestOptions();
        checkFileNameAndContentTypeWithResponse(
            new MultipartFormDataHelper(requestOptions).serializeTextField("id", body.getId())
                .serializeFileField("profileImage", body.getProfileImage().getContent(),
                    body.getProfileImage().getContentType(), body.getProfileImage().getFilename())
                .end()
                .getRequestBody(),
            requestOptions).getValue();
    }

    /**
     * Test content-type: multipart/form-data.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void anonymousModel(AnonymousModelRequest body) {
        // Generated convenience method for anonymousModelWithResponse
        RequestOptions requestOptions = new RequestOptions();
        anonymousModelWithResponse(
            new MultipartFormDataHelper(requestOptions)
                .serializeFileField("profileImage", body.getProfileImage().getContent(),
                    body.getProfileImage().getContentType(), body.getProfileImage().getFilename())
                .end()
                .getRequestBody(),
            requestOptions).getValue();
    }
}
