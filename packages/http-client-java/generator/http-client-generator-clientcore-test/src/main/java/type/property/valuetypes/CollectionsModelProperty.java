package type.property.valuetypes;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Model with collection model properties.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class CollectionsModelProperty implements JsonSerializable<CollectionsModelProperty> {
    /*
     * Property
     */
    private final List<InnerModel> property;

    /**
     * Creates an instance of CollectionsModelProperty class.
     * 
     * @param property the property value to set.
     */
    public CollectionsModelProperty(List<InnerModel> property) {
        this.property = property;
    }

    /**
     * Get the property property: Property.
     * 
     * @return the property value.
     */
    public List<InnerModel> getProperty() {
        return this.property;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("property", this.property, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CollectionsModelProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CollectionsModelProperty if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CollectionsModelProperty.
     */
    public static CollectionsModelProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<InnerModel> property = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("property".equals(fieldName)) {
                    property = reader.readArray(reader1 -> InnerModel.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new CollectionsModelProperty(property);
        });
    }
}
