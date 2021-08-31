import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.kainos.ea.db.JobRolesDAO;
import com.kainos.ea.objects.JobRole;
import com.kainos.ea.resources.JobRolesResource;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.ws.rs.NotFoundException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(DropwizardExtensionsSupport.class)
class JobRolesResourceTest {
  private static JobRolesDAO jobRolesDAO;
  private JobRolesResource resource;
  private JobRole jobRole;
  private ArrayList<JobRole> jobRoles;

  // Creates DAO and mock data for use in later tests
  @BeforeEach
  void setup() {
    jobRolesDAO = mock(JobRolesDAO.class);
    resource = new JobRolesResource(jobRolesDAO);
    jobRole = new JobRole();
    jobRole.setJobRoleID(1);
    jobRoles = new ArrayList<>();
    jobRoles.add(jobRole);
  }

  // Checking happy path functionality of getJobRoles
  @Test
  void getJobRolesSuccess() {
    when(jobRolesDAO.getJobRoles()).thenReturn(jobRoles);

    List<JobRole> result = resource.getJobRoles();
    assertThat(result.get(0)).isEqualTo(jobRole);

    verify(jobRolesDAO).getJobRoles();
  }

  // Checking happy path functionality of getJobRoleDetails
  @Test
  void getJobRoleDetailsSuccess() {
    when(jobRolesDAO.getJobRoleDetails(1)).thenReturn(Optional.of(jobRole));

    JobRole result = resource.getJobRoleDetails(1);
    assertThat(result.getJobRoleID()).isEqualTo(jobRole.getJobRoleID());

    verify(jobRolesDAO).getJobRoleDetails(1);
  }

  // Checking functionality of getJobRoleDetails when JobRole does not exist
  @Test
  void getJobRoleNotFound() {
    when(jobRolesDAO.getJobRoleDetails(8)).thenReturn(Optional.empty());

    Exception e = assertThrows(NotFoundException.class, () -> {
      JobRole result = resource.getJobRoleDetails(8);
    });

    assertTrue(e.getMessage().contains(("Job role not found.")));
    verify(jobRolesDAO).getJobRoleDetails(8);
  }

  @AfterEach
  void tearDown() {
    reset(jobRolesDAO);
  }
}