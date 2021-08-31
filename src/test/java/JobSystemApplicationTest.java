import com.kainos.ea.JobSystemApplication;
import com.kainos.ea.JobSystemConfiguration;
import io.dropwizard.testing.ResourceHelpers;
import io.dropwizard.testing.junit5.DropwizardAppExtension;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.Response;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Testing that the main application can initialise correctly.
 */
@ExtendWith(DropwizardExtensionsSupport.class)
public class JobSystemApplicationTest {

  private static DropwizardAppExtension<JobSystemConfiguration> EXT = new DropwizardAppExtension<>(
      JobSystemApplication.class,
      ResourceHelpers.resourceFilePath("config.yml")
  );

  @Test
  void successfulConnection() {
    Client client = EXT.client();

    Response response = client.target(
        String.format("http://localhost:%d/api/getjobroles", EXT.getLocalPort()))
        .request()
        .get();
    assert (response.getStatus() == 200);
  }
}
