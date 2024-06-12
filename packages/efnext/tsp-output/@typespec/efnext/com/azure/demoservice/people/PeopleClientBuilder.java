
import com.azure.core.credential.TokenCredential;

public class PeopleClientBuilder {
  private final TokenCredential tokenCredential;
  private final String endpoint;
  
  public PeopleClientBuilder() {
    
  }
  public PeopleClientBuilder credential(TokenCredential tokenCredential) {
    this.tokenCredential = tokenCredential;
    return this;
  }
  
  public PeopleAsyncClient buildAsyncClient() {
    return new PeopleAsyncClient(tokenCredential, endpoint);
  }
  
  public PeopleClient buildClient() {
    return new PeopleClient(tokenCredential, endpoint);
  }
}