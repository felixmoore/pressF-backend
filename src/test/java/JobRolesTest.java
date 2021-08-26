import com.fasterxml.jackson.databind.ObjectMapper;
import com.kainos.ea.WebServiceApplication;
import com.kainos.ea.WebServiceConfiguration;
import com.kainos.ea.objects.JobRole;
import com.kainos.ea.resources.DBTest;
import io.dropwizard.jackson.Jackson;
import io.dropwizard.testing.junit5.DropwizardAppExtension;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import static io.dropwizard.testing.FixtureHelpers.fixture;
import static org.assertj.core.api.Assertions.assertThat;

public class JobRolesTest {

    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

    /**
     Checking the mapping from JSON to a DBTest object
     */
    @org.junit.Test
    public void isJobRoleFromJSON() throws Exception {
        final JobRole jobRole = new JobRole(1, "(CTO) Chief Technology Officer", "Technology Lead", "0",
                "2", "Leadership", "0");
        JobRole jobRoleTest = MAPPER.readValue(fixture("fixtures/JobRole.json"), JobRole.class);
        assertThat(jobRoleTest.equals(jobRole));
    }
}
