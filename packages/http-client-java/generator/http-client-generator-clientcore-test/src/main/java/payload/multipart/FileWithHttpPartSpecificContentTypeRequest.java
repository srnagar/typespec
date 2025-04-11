package payload.multipart;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;

/**
 * The FileWithHttpPartSpecificContentTypeRequest model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class FileWithHttpPartSpecificContentTypeRequest {
    /*
     * The profileImage property.
     */
    private final FileSpecificContentType profileImage;

    /**
     * Creates an instance of FileWithHttpPartSpecificContentTypeRequest class.
     * 
     * @param profileImage the profileImage value to set.
     */
    public FileWithHttpPartSpecificContentTypeRequest(FileSpecificContentType profileImage) {
        this.profileImage = profileImage;
    }

    /**
     * Get the profileImage property: The profileImage property.
     * 
     * @return the profileImage value.
     */
    public FileSpecificContentType getProfileImage() {
        return this.profileImage;
    }
}
