package type.property.optional;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;

/**
 * Model with union of string literal property.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class UnionStringLiteralProperty implements JsonSerializable<UnionStringLiteralProperty> {
    /*
     * Property
     */
    private UnionStringLiteralPropertyProperty property;

    /**
     * Creates an instance of UnionStringLiteralProperty class.
     */
    public UnionStringLiteralProperty() {
    }

    /**
     * Get the property property: Property.
     * 
     * @return the property value.
     */
    public UnionStringLiteralPropertyProperty getProperty() {
        return this.property;
    }

    /**
     * Set the property property: Property.
     * 
     * @param property the property value to set.
     * @return the UnionStringLiteralProperty object itself.
     */
    public UnionStringLiteralProperty setProperty(UnionStringLiteralPropertyProperty property) {
        this.property = property;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("property", this.property == null ? null : this.property.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UnionStringLiteralProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UnionStringLiteralProperty if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UnionStringLiteralProperty.
     */
    public static UnionStringLiteralProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UnionStringLiteralProperty deserializedUnionStringLiteralProperty = new UnionStringLiteralProperty();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("property".equals(fieldName)) {
                    deserializedUnionStringLiteralProperty.property
                        = UnionStringLiteralPropertyProperty.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUnionStringLiteralProperty;
        });
    }
}
