package type.property.additionalproperties;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.models.binarydata.BinaryData;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The derived discriminated type.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class IsUnknownAdditionalPropertiesDiscriminatedDerived
    extends IsUnknownAdditionalPropertiesDiscriminated {
    /*
     * The discriminator
     */
    private String kind = "derived";

    /*
     * The index property
     */
    private final int index;

    /*
     * The age property
     */
    private Double age;

    /**
     * Creates an instance of IsUnknownAdditionalPropertiesDiscriminatedDerived class.
     * 
     * @param name the name value to set.
     * @param index the index value to set.
     */
    public IsUnknownAdditionalPropertiesDiscriminatedDerived(String name, int index) {
        super(name);
        this.index = index;
    }

    /**
     * Get the kind property: The discriminator.
     * 
     * @return the kind value.
     */
    @Override
    public String getKind() {
        return this.kind;
    }

    /**
     * Get the index property: The index property.
     * 
     * @return the index value.
     */
    public int getIndex() {
        return this.index;
    }

    /**
     * Get the age property: The age property.
     * 
     * @return the age value.
     */
    public Double getAge() {
        return this.age;
    }

    /**
     * Set the age property: The age property.
     * 
     * @param age the age value to set.
     * @return the IsUnknownAdditionalPropertiesDiscriminatedDerived object itself.
     */
    public IsUnknownAdditionalPropertiesDiscriminatedDerived setAge(Double age) {
        this.age = age;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeIntField("index", this.index);
        jsonWriter.writeStringField("kind", this.kind);
        jsonWriter.writeNumberField("age", this.age);
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, BinaryData> additionalProperty : getAdditionalProperties().entrySet()) {
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
     * Reads an instance of IsUnknownAdditionalPropertiesDiscriminatedDerived from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IsUnknownAdditionalPropertiesDiscriminatedDerived if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IsUnknownAdditionalPropertiesDiscriminatedDerived.
     */
    public static IsUnknownAdditionalPropertiesDiscriminatedDerived fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String name = null;
            int index = 0;
            String kind = "derived";
            Double age = null;
            Map<String, BinaryData> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("index".equals(fieldName)) {
                    index = reader.getInt();
                } else if ("kind".equals(fieldName)) {
                    kind = reader.getString();
                } else if ("age".equals(fieldName)) {
                    age = reader.getNullable(JsonReader::getDouble);
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName,
                        reader.getNullable(nonNullReader -> BinaryData.fromObject(nonNullReader.readUntyped())));
                }
            }
            IsUnknownAdditionalPropertiesDiscriminatedDerived deserializedIsUnknownAdditionalPropertiesDiscriminatedDerived
                = new IsUnknownAdditionalPropertiesDiscriminatedDerived(name, index);
            deserializedIsUnknownAdditionalPropertiesDiscriminatedDerived.kind = kind;
            deserializedIsUnknownAdditionalPropertiesDiscriminatedDerived.age = age;
            deserializedIsUnknownAdditionalPropertiesDiscriminatedDerived.setAdditionalProperties(additionalProperties);

            return deserializedIsUnknownAdditionalPropertiesDiscriminatedDerived;
        });
    }
}
