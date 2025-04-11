package payload.multipart;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;

/**
 * The FileWithHttpPartRequiredContentTypeRequest model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class FileWithHttpPartRequiredContentTypeRequest {
    /*
     * The profileImage property.
     */
    private final FileRequiredMetaData profileImage;

    /**
     * Creates an instance of FileWithHttpPartRequiredContentTypeRequest class.
     * 
     * @param profileImage the profileImage value to set.
     */
    public FileWithHttpPartRequiredContentTypeRequest(FileRequiredMetaData profileImage) {
        this.profileImage = profileImage;
    }

    /**
     * Get the profileImage property: The profileImage property.
     * 
     * @return the profileImage value.
     */
    public FileRequiredMetaData getProfileImage() {
        return this.profileImage;
    }
}
