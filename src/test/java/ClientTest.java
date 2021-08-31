import static org.junit.jupiter.api.Assertions.assertEquals;

import io.dropwizard.testing.junit5.DropwizardClientExtension;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(DropwizardExtensionsSupport.class)
class ClientTest {
  private static final DropwizardClientExtension EXT = new DropwizardClientExtension(new PingResource());

  @Test
  void shouldPing() throws IOException {
    final URL url = new URL(EXT.baseUri() + "/ping");
    final String response = new BufferedReader(new InputStreamReader(url.openStream())).readLine();
    assertEquals("pong", response);
  }

  @Path("/ping")
  public static class PingResource {
    @GET
    public String ping() {
      return "pong";
    }
  }
}