
import com.azure.core.credential.TokenCredential; 

public class PetsClient {
  private final PetsServiceClient innerClient;
  
  public PetsClient(PetsServiceClient innerClient) {
    this.innerClient = innerClient;
  }
}