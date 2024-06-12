
import com.azure.core.credential.TokenCredential; 

public class PeopleAsyncClient {
  private final PeopleServiceClient innerClient;
  
  public PeopleAsyncClient(PeopleServiceClient innerClient) {
    this.innerClient = innerClient;
  }
}