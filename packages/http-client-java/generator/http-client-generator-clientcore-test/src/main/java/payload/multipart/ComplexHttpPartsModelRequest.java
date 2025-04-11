package payload.multipart;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import java.util.List;

/**
 * The ComplexHttpPartsModelRequest model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class ComplexHttpPartsModelRequest {
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
    private final FileRequiredMetaData profileImage;

    /*
     * The previousAddresses property.
     */
    private final List<Address> previousAddresses;

    /*
     * The pictures property.
     */
    private final List<FileRequiredMetaData> pictures;

    /**
     * Creates an instance of ComplexHttpPartsModelRequest class.
     * 
     * @param id the id value to set.
     * @param address the address value to set.
     * @param profileImage the profileImage value to set.
     * @param previousAddresses the previousAddresses value to set.
     * @param pictures the pictures value to set.
     */
    public ComplexHttpPartsModelRequest(String id, Address address, FileRequiredMetaData profileImage,
        List<Address> previousAddresses, List<FileRequiredMetaData> pictures) {
        this.id = id;
        this.address = address;
        this.profileImage = profileImage;
        this.previousAddresses = previousAddresses;
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
    public FileRequiredMetaData getProfileImage() {
        return this.profileImage;
    }

    /**
     * Get the previousAddresses property: The previousAddresses property.
     * 
     * @return the previousAddresses value.
     */
    public List<Address> getPreviousAddresses() {
        return this.previousAddresses;
    }

    /**
     * Get the pictures property: The pictures property.
     * 
     * @return the pictures value.
     */
    public List<FileRequiredMetaData> getPictures() {
        return this.pictures;
    }
}
