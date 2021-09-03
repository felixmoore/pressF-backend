package com.kainos.ea.db;

import com.kainos.ea.objects.JobRole;
import com.kainos.ea.objects.JobRoleResponsibilities;
import java.util.List;
import java.util.Optional;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

/**
 * DAO interface for the JobRoles table.
 */
public interface JobRolesDAO {
  @SqlQuery("SELECT JobRoleID, JobTitle, JobSpecification, jc.JobCapability, jd.JobDiscipline, jb.JobBand, JobCompetencies, RecordCreated "
      + "FROM JobRoles JOIN JobBand jb ON JobRoles.JobBand = jb.JobBandID JOIN JobDiscipline jd ON JobRoles.JobDiscipline = jd.JobDisciplineID "
      + "JOIN JobCapability jc ON JobRoles.JobCapability = jc.JobCapabilityID")
  @RegisterBeanMapper(JobRole.class)
  List<JobRole> getJobRoles();

  @SqlQuery(
      "SELECT JobRoleID, JobTitle, JobSpecification, jc.JobCapability, jd.JobDiscipline, jb.JobBand, JobCompetencies, JobProfileLink, RecordCreated "
          + "FROM JobRoles JOIN JobBand jb ON JobRoles.JobBand = jb.JobBandID JOIN JobDiscipline jd ON JobRoles.JobDiscipline = jd.JobDisciplineID "
          + "JOIN JobCapability jc ON JobRoles.JobCapability = jc.JobCapabilityID WHERE JobRoleID = :jobRoleId")
  @RegisterBeanMapper(JobRole.class)
  Optional<JobRole> getJobRoleDetails(@Bind("jobRoleId") int jobRoleId);

  @SqlQuery("SELECT JobRoleResponsibility FROM JobRoleResponsibilities WHERE JobRoleID = :jobRoleId")
  @RegisterBeanMapper(JobRoleResponsibilities.class)
  List<JobRoleResponsibilities> getJobResponsibilities(@Bind("jobRoleId") int jobRoleId);
}
