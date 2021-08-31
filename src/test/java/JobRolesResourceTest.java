import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.kainos.ea.db.JobRolesDAO;
import com.kainos.ea.objects.JobRole;
import com.kainos.ea.resources.JobRolesResource;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import io.dropwizard.testing.junit5.ResourceExtension;
import java.util.Optional;
import javax.ws.rs.core.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(DropwizardExtensionsSupport.class)
class JobRolesResourceTest {
  private static final JobRolesDAO jobRolesDAO = mock(JobRolesDAO.class);
  private static final ResourceExtension EXT = ResourceExtension.builder()
      .addResource(new JobRolesResource(jobRolesDAO))
      .build();
  private JobRole jobRole;

  @BeforeEach
  void setup() {
    jobRole = new JobRole();
    jobRole.setJobRoleID(1);
  }

  @AfterEach
  void tearDown() {
    reset(jobRolesDAO);
  }

  @Test
  void getJobRoleDetailsSuccess() {
    when(jobRolesDAO.getJobRoleDetails(1)).thenReturn(Optional.of(jobRole));

    JobRole found = EXT.target("/api/getjobroledetails/1").request().get(JobRole.class);

    assertThat(found.getJobRoleID()).isEqualTo(jobRole.getJobRoleID());
    verify(jobRolesDAO).getJobRoleDetails(1);
  }

  @Test
  void getPersonNotFound() {
    when(jobRolesDAO.getJobRoleDetails(8)).thenReturn(Optional.empty());
    final Response response = EXT.target("/api/getjobroledetails/8").request().get();

    assertThat(response.getStatusInfo().getStatusCode()).isEqualTo(Response.Status.NOT_FOUND.getStatusCode());
    verify(jobRolesDAO).getJobRoleDetails(8);
  }
}