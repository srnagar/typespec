package type.property.valuetypes;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;

/**
 * Model with a string property.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class StringProperty implements JsonSerializable<StringProperty> {
    /*
     * Property
     */
    private final String property;

    /**
     * Creates an instance of StringProperty class.
     * 
     * @param property the property value to set.
     */
    public StringProperty(String property) {
        this.property = property;
    }

    /**
     * Get the property property: Property.
     * 
     * @return the property value.
     */
    public String getProperty() {
        return this.property;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("property", this.property);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StringProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StringProperty if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StringProperty.
     */
    public static StringProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String property = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("property".equals(fieldName)) {
                    property = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new StringProperty(property);
        });
    }
}
