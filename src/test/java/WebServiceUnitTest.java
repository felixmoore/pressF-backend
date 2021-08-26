import com.kainos.ea.WebServiceApplication;
import com.kainos.ea.WebServiceConfiguration;
import io.dropwizard.testing.junit5.DropwizardAppExtension;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@ExtendWith(DropwizardExtensionsSupport.class)
public class WebServiceUnitTest {
    public static final DropwizardAppExtension<WebServiceConfiguration> APP = new DropwizardAppExtension<WebServiceConfiguration>(WebServiceApplication.class);
    public final int port = APP.getLocalPort();

    /**
     * Simple test to ensure the WebService initialises correctly, and will return a response.
     * @throws IOException
     */
    @Test
    public void shouldPing() throws IOException {
        final URL url = new URL(String.format("http://localhost:%d/api/ping", port));
        final String response = new BufferedReader(new InputStreamReader(url.openStream())).readLine();
        assertEquals("pong", response);
    }

    /**
     * Test to determine whether the WebService responds as expected to the print route.
     * @throws IOException
     */
    @Test
    public void shouldPrint() throws IOException {
        final String url = String.format("http://localhost:%d/api/print/hi", port);
        String response = APP.client().target(url).request().get().readEntity(String.class);
        assertEquals("Hello from a RESTful Web service: hi", response);
    }

    /**
     * Tests that the database connection is created successfully.
     * @throws IOException
     */
    @Test
    public void shouldConnectToDatabase() throws IOException {
        final Response connectionResponse =
                APP.client().target("http://localhost:" + APP.getLocalPort() + "/api/testMybatis")
                        .request()
                        .get();

        assertThat(connectionResponse)
                .extracting(Response::getStatus)
                .isEqualTo(Response.Status.OK.getStatusCode());
    }

    /**
     * Tests that data is returned from the TestTable in the correct format.
     * TODO: replace with legitimate table
     * @throws IOException
     */
    @Test
    public void shouldReturnFromDatabase() throws IOException {
        final String url = String.format("http://localhost:%d/api/testMybatis", port);
        Response response = APP.client().target(url).request().get();
        response.bufferEntity();
        String s = response.readEntity(String.class);
        System.out.println(s);
        assertEquals("[{\"id\":1,\"ID\":1,\"testMessage\":\"This is a TEST!\"},{\"id\":2,\"ID\":2,\"testMessage\":\"This is another TEST!\"}]", s);
    }

}
