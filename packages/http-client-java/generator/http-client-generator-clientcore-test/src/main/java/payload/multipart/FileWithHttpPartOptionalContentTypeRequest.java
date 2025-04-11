package payload.multipart;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;

/**
 * The FileWithHttpPartOptionalContentTypeRequest model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class FileWithHttpPartOptionalContentTypeRequest {
    /*
     * The profileImage property.
     */
    private final FileOptionalContentType profileImage;

    /**
     * Creates an instance of FileWithHttpPartOptionalContentTypeRequest class.
     * 
     * @param profileImage the profileImage value to set.
     */
    public FileWithHttpPartOptionalContentTypeRequest(FileOptionalContentType profileImage) {
        this.profileImage = profileImage;
    }

    /**
     * Get the profileImage property: The profileImage property.
     * 
     * @return the profileImage value.
     */
    public FileOptionalContentType getProfileImage() {
        return this.profileImage;
    }
}
