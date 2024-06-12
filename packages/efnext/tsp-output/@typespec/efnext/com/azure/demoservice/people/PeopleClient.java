
import com.azure.core.credential.TokenCredential; 

public class PeopleClient {
  private final PeopleServiceClient innerClient;
  
  public PeopleClient(PeopleServiceClient innerClient) {
    this.innerClient = innerClient;
  }
}