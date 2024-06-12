
import com.azure.core.credential.TokenCredential;

public class PetsClientBuilder {
  private final TokenCredential tokenCredential;
  private final String endpoint;
  
  public PetsClientBuilder() {
    
  }
  public PetsClientBuilder credential(TokenCredential tokenCredential) {
    this.tokenCredential = tokenCredential;
    return this;
  }
  
  public PetsAsyncClient buildAsyncClient() {
    return new PetsAsyncClient(tokenCredential, endpoint);
  }
  
  public PetsClient buildClient() {
    return new PetsClient(tokenCredential, endpoint);
  }
}