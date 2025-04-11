package type.union;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;

/**
 * The Dog model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class Dog implements JsonSerializable<Dog> {
    /*
     * The bark property.
     */
    private final String bark;

    /**
     * Creates an instance of Dog class.
     * 
     * @param bark the bark value to set.
     */
    public Dog(String bark) {
        this.bark = bark;
    }

    /**
     * Get the bark property: The bark property.
     * 
     * @return the bark value.
     */
    public String getBark() {
        return this.bark;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("bark", this.bark);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Dog from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Dog if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Dog.
     */
    public static Dog fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String bark = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("bark".equals(fieldName)) {
                    bark = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new Dog(bark);
        });
    }
}
