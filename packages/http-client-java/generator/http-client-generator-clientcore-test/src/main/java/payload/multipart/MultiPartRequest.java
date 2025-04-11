package payload.multipart;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;

/**
 * The MultiPartRequest model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class MultiPartRequest {
    /*
     * The id property.
     */
    private final String id;

    /*
     * The profileImage property.
     */
    private final ProfileImageFileDetails profileImage;

    /**
     * Creates an instance of MultiPartRequest class.
     * 
     * @param id the id value to set.
     * @param profileImage the profileImage value to set.
     */
    public MultiPartRequest(String id, ProfileImageFileDetails profileImage) {
        this.id = id;
        this.profileImage = profileImage;
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the profileImage property: The profileImage property.
     * 
     * @return the profileImage value.
     */
    public ProfileImageFileDetails getProfileImage() {
        return this.profileImage;
    }
}
