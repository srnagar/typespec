// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package tsptest.errormodel.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An object containing more specific information about the error. As per Microsoft One API guidelines -
 * https://github.com/Microsoft/api-guidelines/blob/vNext/Guidelines.md#7102-error-condition-responses.
 */
@Immutable
public final class InnerError implements JsonSerializable<InnerError> {
    /*
     * One of a server-defined set of error codes.
     */
    @Generated
    private String code;

    /*
     * Inner error.
     */
    @Generated
    private InnerError innerError;

    /**
     * Creates an instance of InnerError class.
     */
    @Generated
    private InnerError() {
    }

    /**
     * Get the code property: One of a server-defined set of error codes.
     * 
     * @return the code value.
     */
    @Generated
    public String getCode() {
        return this.code;
    }

    /**
     * Get the innerError property: Inner error.
     * 
     * @return the innerError value.
     */
    @Generated
    public InnerError getInnerError() {
        return this.innerError;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeJsonField("innererror", this.innerError);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InnerError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InnerError if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the InnerError.
     */
    @Generated
    public static InnerError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InnerError deserializedInnerError = new InnerError();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedInnerError.code = reader.getString();
                } else if ("innererror".equals(fieldName)) {
                    deserializedInnerError.innerError = InnerError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInnerError;
        });
    }
}
