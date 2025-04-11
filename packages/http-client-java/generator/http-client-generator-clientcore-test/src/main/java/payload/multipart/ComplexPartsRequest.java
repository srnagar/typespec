package payload.multipart;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import java.util.List;

/**
 * The ComplexPartsRequest model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ComplexPartsRequest {
    /*
     * The id property.
     */
    private final String id;

    /*
     * The address property.
     */
    private final Address address;

    /*
     * The profileImage property.
     */
    private final ProfileImageFileDetails profileImage;

    /*
     * The pictures property.
     */
    private final List<PicturesFileDetails> pictures;

    /**
     * Creates an instance of ComplexPartsRequest class.
     * 
     * @param id the id value to set.
     * @param address the address value to set.
     * @param profileImage the profileImage value to set.
     * @param pictures the pictures value to set.
     */
    public ComplexPartsRequest(String id, Address address, ProfileImageFileDetails profileImage,
        List<PicturesFileDetails> pictures) {
        this.id = id;
        this.address = address;
        this.profileImage = profileImage;
        this.pictures = pictures;
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

    /**
     * Get the pictures property: The pictures property.
     * 
     * @return the pictures value.
     */
    public List<PicturesFileDetails> getPictures() {
        return this.pictures;
    }
}
