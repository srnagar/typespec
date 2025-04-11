package type.property.valuetypes;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;

/**
 * Model with a bytes property.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class BytesProperty implements JsonSerializable<BytesProperty> {
    /*
     * Property
     */
    private final byte[] property;

    /**
     * Creates an instance of BytesProperty class.
     * 
     * @param property the property value to set.
     */
    public BytesProperty(byte[] property) {
        this.property = property;
    }

    /**
     * Get the property property: Property.
     * 
     * @return the property value.
     */
    public byte[] getProperty() {
        return this.property;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBinaryField("property", this.property);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BytesProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BytesProperty if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BytesProperty.
     */
    public static BytesProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            byte[] property = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("property".equals(fieldName)) {
                    property = reader.getBinary();
                } else {
                    reader.skipChildren();
                }
            }
            return new BytesProperty(property);
        });
    }
}
