import static io.dropwizard.testing.FixtureHelpers.fixture;
import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kainos.ea.objects.JobRole;
import io.dropwizard.jackson.Jackson;

public class JobRolesTest {

  private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

  /**
   * Checking the mapping from JSON to a DBTest object
   */
  @org.junit.Test
  public void isJobRoleFromJSON() throws Exception {
    final JobRole jobRole = new JobRole(1, "(CTO) Chief Technology Officer", "Technology Lead", "0",
        "2", "Leadership", "0");
    JobRole jobRoleTest = MAPPER.readValue(fixture("fixtures/JobRole.json"), JobRole.class);
    assertThat(jobRoleTest.equals(jobRole));
  }
}
