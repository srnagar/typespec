package payload.multipart;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;

/**
 * The file details for the "picture" field.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class PictureFileDetails {
    /*
     * The content of the file.
     */
    private final Flux<ByteBuffer> content;

    /*
     * The filename of the file.
     */
    private String filename;

    /*
     * The content-type of the file.
     */
    private String contentType = "application/octet-stream";

    /**
     * Creates an instance of PictureFileDetails class.
     * 
     * @param content the content value to set.
     */
    public PictureFileDetails(Flux<ByteBuffer> content) {
        this.content = content;
    }

    /**
     * Get the content property: The content of the file.
     * 
     * @return the content value.
     */
    public Flux<ByteBuffer> getContent() {
        return this.content;
    }

    /**
     * Get the filename property: The filename of the file.
     * 
     * @return the filename value.
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * Set the filename property: The filename of the file.
     * 
     * @param filename the filename value to set.
     * @return the PictureFileDetails object itself.
     */
    public PictureFileDetails setFilename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Get the contentType property: The content-type of the file.
     * 
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The content-type of the file.
     * 
     * @param contentType the contentType value to set.
     * @return the PictureFileDetails object itself.
     */
    public PictureFileDetails setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
}
