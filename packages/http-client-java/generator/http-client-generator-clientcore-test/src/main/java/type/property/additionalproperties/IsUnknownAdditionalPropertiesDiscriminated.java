package type.property.additionalproperties;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.models.binarydata.BinaryData;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The model is Record&lt;unknown&gt; with a discriminator.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public class IsUnknownAdditionalPropertiesDiscriminated
    implements JsonSerializable<IsUnknownAdditionalPropertiesDiscriminated> {
    /*
     * The discriminator
     */
    private String kind = "IsUnknownAdditionalPropertiesDiscriminated";

    /*
     * The name property
     */
    private final String name;

    /*
     * The model is Record<unknown> with a discriminator.
     */
    private Map<String, BinaryData> additionalProperties;

    /**
     * Creates an instance of IsUnknownAdditionalPropertiesDiscriminated class.
     * 
     * @param name the name value to set.
     */
    public IsUnknownAdditionalPropertiesDiscriminated(String name) {
        this.name = name;
    }

    /**
     * Get the kind property: The discriminator.
     * 
     * @return the kind value.
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the additionalProperties property: The model is Record&lt;unknown&gt; with a discriminator.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, BinaryData> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The model is Record&lt;unknown&gt; with a discriminator.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the IsUnknownAdditionalPropertiesDiscriminated object itself.
     */
    public IsUnknownAdditionalPropertiesDiscriminated
        setAdditionalProperties(Map<String, BinaryData> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("kind", this.kind);
        if (additionalProperties != null) {
            for (Map.Entry<String, BinaryData> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeFieldName(additionalProperty.getKey());
                if (additionalProperty.getValue() == null) {
                    jsonWriter.writeNull();
                } else {
                    additionalProperty.getValue().writeTo(jsonWriter);
                }
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IsUnknownAdditionalPropertiesDiscriminated from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IsUnknownAdditionalPropertiesDiscriminated if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IsUnknownAdditionalPropertiesDiscriminated.
     */
    public static IsUnknownAdditionalPropertiesDiscriminated fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("kind".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("derived".equals(discriminatorValue)) {
                    return IsUnknownAdditionalPropertiesDiscriminatedDerived.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static IsUnknownAdditionalPropertiesDiscriminated fromJsonKnownDiscriminator(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            String name = null;
            String kind = null;
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    kind = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            IsUnknownAdditionalPropertiesDiscriminated deserializedIsUnknownAdditionalPropertiesDiscriminated
                = new IsUnknownAdditionalPropertiesDiscriminated(name);
            deserializedIsUnknownAdditionalPropertiesDiscriminated.kind = kind;
            deserializedIsUnknownAdditionalPropertiesDiscriminated.additionalProperties = additionalProperties;

            return deserializedIsUnknownAdditionalPropertiesDiscriminated;
        });
    }
}
