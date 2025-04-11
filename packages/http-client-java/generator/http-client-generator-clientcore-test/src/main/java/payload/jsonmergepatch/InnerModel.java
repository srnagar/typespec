package payload.jsonmergepatch;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import payload.jsonmergepatch.implementation.JsonMergePatchHelper;

/**
 * It is the model used by Resource model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class InnerModel implements JsonSerializable<InnerModel> {
    /*
     * The name property.
     */
    private String name;

    /*
     * The description property.
     */
    private String description;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    private final Set<String> updatedProperties = new HashSet<>();

    private boolean jsonMergePatch;

    private void serializeAsJsonMergePatch(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setInnerModelAccessor(new JsonMergePatchHelper.InnerModelAccessor() {
            @Override
            public InnerModel prepareModelForJsonMergePatch(InnerModel model, boolean jsonMergePatchEnabled) {
                model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
                return model;
            }

            @Override
            public boolean isJsonMergePatch(InnerModel model) {
                return model.jsonMergePatch;
            }
        });
    }

    /**
     * Creates an instance of InnerModel class.
     */
    public InnerModel() {
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
     * Set the name property: The name property.
     * 
     * @param name the name value to set.
     * @return the InnerModel object itself.
     */
    public InnerModel setName(String name) {
        this.name = name;
        this.updatedProperties.add("name");
        return this;
    }

    /**
     * Get the description property: The description property.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description property.
     * 
     * @param description the description value to set.
     * @return the InnerModel object itself.
     */
    public InnerModel setDescription(String description) {
        this.description = description;
        this.updatedProperties.add("description");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (jsonMergePatch) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("name", this.name);
            jsonWriter.writeStringField("description", this.description);
            return jsonWriter.writeEndObject();
        }
    }

    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (updatedProperties.contains("name")) {
            if (this.name == null) {
                jsonWriter.writeNullField("name");
            } else {
                jsonWriter.writeStringField("name", this.name);
            }
        }
        if (updatedProperties.contains("description")) {
            if (this.description == null) {
                jsonWriter.writeNullField("description");
            } else {
                jsonWriter.writeStringField("description", this.description);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InnerModel from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InnerModel if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the InnerModel.
     */
    public static InnerModel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InnerModel deserializedInnerModel = new InnerModel();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedInnerModel.name = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedInnerModel.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInnerModel;
        });
    }
}
