
import com.azure.core.credential.TokenCredential; 

public class PetsAsyncClient {
  private final PetsServiceClient innerClient;
  
  public PetsAsyncClient(PetsServiceClient innerClient) {
    this.innerClient = innerClient;
  }
}