import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.kainos.ea.db.JobRolesDAO;
import com.kainos.ea.objects.JobBand;
import com.kainos.ea.objects.JobCapability;
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
  private JobBand jobBand;
  private JobCapability jobCapability;

  // Creates DAO and mock data for use in later tests
  @BeforeEach
  void setup() {
    jobRolesDAO = mock(JobRolesDAO.class);
    resource = new JobRolesResource(jobRolesDAO);
    jobRole = new JobRole();
    jobRole.setJobRoleID(1);
    jobRole.setJobTitle("Test");
    jobRole.setJobSpecification("Test Spec");
    jobRole.setJobBand("1");
    jobRole.setJobCapability("2");
    jobRole.setJobDiscipline("1");
    jobRole.setJobCompetencies("Test competencies");
    jobRoles = new ArrayList<>();
    jobRoles.add(jobRole);
    jobBand = new JobBand();
    jobBand.setJobBand("Test JobBand");
    jobBand.setJobBandTraining("Test Training for band");
    jobCapability = new JobCapability();
    jobCapability.setJobCapability("Test Capability");
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

  @Test
  void addJobRoleSuccess() {
    when(jobRolesDAO.addJobRole("Test", "Test Spec", 0, 0, 0, "Test competencies")).thenReturn(true);
    boolean result = resource.addJobRole(jobRole);
    assertEquals(true, result);

    verify(jobRolesDAO).addJobRole("Test", "Test Spec", 0, 0, 0, "Test competencies");
  }

  @Test
  void addJobRoleFailure() {
    when(jobRolesDAO.addJobRole("Test", "Test Spec", 0, 0, 0, "Test competencies")).thenReturn(false);
    boolean result = resource.addJobRole(jobRole);
    assertEquals(false, result);

    verify(jobRolesDAO).addJobRole("Test", "Test Spec", 0, 0, 0, "Test competencies");
  }

  @Test
  void addJobBandSuccess() {
    when(jobRolesDAO.addJobBand("Test JobBand", "Test Training for band")).thenReturn(true);
    boolean result = resource.addJobBand(jobBand);
    assertEquals(true, result);

    verify(jobRolesDAO).addJobBand("Test JobBand", "Test Training for band");
  }

  @Test
  void addJobBandFailure() {
    when(jobRolesDAO.addJobBand("Test JobBand", "Test Training for band")).thenReturn(false);
    boolean result = resource.addJobBand(jobBand);
    assertEquals(false, result);

    verify(jobRolesDAO).addJobBand("Test JobBand", "Test Training for band");
  }

  @Test
  void addJobCapabilitySuccess() {
    when(jobRolesDAO.addJobCapability("Test Capability")).thenReturn(false);
    boolean result = resource.addJobCapability(jobCapability);
    assertEquals(false, result);

    verify(jobRolesDAO).addJobCapability("Test Capability");
  }

  @Test
  void addJobCababilityFailure() {
    when(jobRolesDAO.addJobCapability("Test Capability")).thenReturn(false);
    boolean result = resource.addJobCapability(jobCapability);
    assertEquals(false, result);

    verify(jobRolesDAO).addJobCapability("Test Capability");
  }

  @AfterEach
  void tearDown() {
    reset(jobRolesDAO);
  }
}