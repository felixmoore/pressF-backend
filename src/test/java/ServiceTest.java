import static io.dropwizard.testing.FixtureHelpers.*;
import static org.assertj.core.api.Assertions.assertThat;
import com.kainos.ea.resources.DBTest;
import io.dropwizard.jackson.Jackson;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ServiceTest {

    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

    /*
        Asserting that DBTest objects correctly map to a JSON object
        From: https://www.dropwizard.io/en/latest/manual/testing.html
     */
    @Test
    public void serialisesToJSON() throws Exception {
        final DBTest t = new DBTest(1, "This is a TEST!");
        final String expected = MAPPER.writeValueAsString(
                MAPPER.readValue(fixture("fixtures/DBTest.json"), DBTest.class));
        assertThat(MAPPER.writeValueAsString(t)).isEqualTo(expected);
    }

    /*
        Checking the mapping from JSON to a DBTest object
     */
    @Test
    public void deserialisesFromJSON() throws Exception {
        final DBTest originalDBTest = new DBTest(1, "This is a TEST!");
        DBTest newDBTest = MAPPER.readValue(fixture("fixtures/DBTest.json"), DBTest.class);

        assertThat(newDBTest.equals(originalDBTest));
    }
}
