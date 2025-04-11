package payload.multipart;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;

/**
 * The JsonPartRequest model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class JsonPartRequest {
    /*
     * The address property.
     */
    private final Address address;

    /*
     * The profileImage property.
     */
    private final ProfileImageFileDetails profileImage;

    /**
     * Creates an instance of JsonPartRequest class.
     * 
     * @param address the address value to set.
     * @param profileImage the profileImage value to set.
     */
    public JsonPartRequest(Address address, ProfileImageFileDetails profileImage) {
        this.address = address;
        this.profileImage = profileImage;
    }

    /**
     * Get the address property: The address property.
     * 
     * @return the address value.
     */
    public Address getAddress() {
        return this.address;
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
