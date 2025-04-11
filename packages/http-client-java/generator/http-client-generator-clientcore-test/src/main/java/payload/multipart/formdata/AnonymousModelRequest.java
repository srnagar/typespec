package payload.multipart.formdata;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import payload.multipart.ProfileImageFileDetails;

/**
 * The AnonymousModelRequest model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class AnonymousModelRequest {
    /*
     * The profileImage property.
     */
    private final ProfileImageFileDetails profileImage;

    /**
     * Creates an instance of AnonymousModelRequest class.
     * 
     * @param profileImage the profileImage value to set.
     */
    public AnonymousModelRequest(ProfileImageFileDetails profileImage) {
        this.profileImage = profileImage;
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
