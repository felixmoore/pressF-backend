import com.kainos.ea.WebServiceApplication;
import com.kainos.ea.WebServiceConfiguration;
import io.dropwizard.testing.junit5.DropwizardAppExtension;
import io.dropwizard.testing.junit5.DropwizardClientExtension;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import static org.junit.Assert.assertEquals;

@ExtendWith(DropwizardExtensionsSupport.class)
public class WebServiceUnitTest {
    public static final DropwizardAppExtension<WebServiceConfiguration> dropwizardAppExtension = new DropwizardAppExtension<WebServiceConfiguration>(WebServiceApplication.class);
    public final int port = dropwizardAppExtension.getLocalPort();


    @Test
    public void shouldPing() throws IOException {
        final URL url = new URL(String.format("http://localhost:%d/api/ping", port));
        final String response = new BufferedReader(new InputStreamReader(url.openStream())).readLine();
        assertEquals("pong", response);
        System.out.println(dropwizardAppExtension.getEnvironment().getName());
        System.out.println(dropwizardAppExtension.getEnvironment().getApplicationContext().getContextPath());
    }


    @Test
    void shouldConnectToDatabase() throws IOException {
        final URL url = new URL(String.format("http://localhost:%d/api/testMybatis", port));
        final String response = new BufferedReader(new InputStreamReader(url.openStream())).readLine();
        //TODO change to a status code check, add another test for actual data response
        assertEquals("[{\"id\":1,\"ID\":1,\"testMessage\":\"This is a TEST!\"},{\"id\":2,\"ID\":2,\"testMessage\":\"This is another TEST!\"}]", response);

    }

    @Test
    void shouldPrint() throws IOException {
        final URL url = new URL(String.format("http://localhost:%d/api/print/hi", port));
        final String response = new BufferedReader(new InputStreamReader(url.openStream())).readLine();
        assertEquals("Hello from a RESTful Web service: hi", response);
    }


}
