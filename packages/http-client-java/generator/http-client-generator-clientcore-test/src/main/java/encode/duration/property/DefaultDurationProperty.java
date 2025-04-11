package encode.duration.property;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.Objects;

/**
 * The DefaultDurationProperty model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class DefaultDurationProperty implements JsonSerializable<DefaultDurationProperty> {
    /*
     * The value property.
     */
    private final Duration value;

    /**
     * Creates an instance of DefaultDurationProperty class.
     * 
     * @param value the value value to set.
     */
    public DefaultDurationProperty(Duration value) {
        this.value = value;
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public Duration getValue() {
        return this.value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", Objects.toString(this.value, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DefaultDurationProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DefaultDurationProperty if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DefaultDurationProperty.
     */
    public static DefaultDurationProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Duration value = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    value = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }
            return new DefaultDurationProperty(value);
        });
    }
}
