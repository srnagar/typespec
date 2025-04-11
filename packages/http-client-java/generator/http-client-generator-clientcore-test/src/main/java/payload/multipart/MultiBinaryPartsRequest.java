package payload.multipart;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;

/**
 * The MultiBinaryPartsRequest model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class MultiBinaryPartsRequest {
    /*
     * The profileImage property.
     */
    private final ProfileImageFileDetails profileImage;

    /*
     * The picture property.
     */
    private PictureFileDetails picture;

    /**
     * Creates an instance of MultiBinaryPartsRequest class.
     * 
     * @param profileImage the profileImage value to set.
     */
    public MultiBinaryPartsRequest(ProfileImageFileDetails profileImage) {
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

    /**
     * Get the picture property: The picture property.
     * 
     * @return the picture value.
     */
    public PictureFileDetails getPicture() {
        return this.picture;
    }

    /**
     * Set the picture property: The picture property.
     * 
     * @param picture the picture value to set.
     * @return the MultiBinaryPartsRequest object itself.
     */
    public MultiBinaryPartsRequest setPicture(PictureFileDetails picture) {
        this.picture = picture;
        return this;
    }
}
