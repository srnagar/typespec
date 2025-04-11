package payload.multipart.formdata.httpparts.nonstring;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;

/**
 * The FloatRequest model.
 */
@Metadata(properties = { MetadataProperties.IMMUTABLE })
public final class FloatRequest {
    /*
     * The temperature property.
     */
    private final double temperature;

    /**
     * Creates an instance of FloatRequest class.
     * 
     * @param temperature the temperature value to set.
     */
    public FloatRequest(double temperature) {
        this.temperature = temperature;
    }

    /**
     * Get the temperature property: The temperature property.
     * 
     * @return the temperature value.
     */
    public double getTemperature() {
        return this.temperature;
    }
}
