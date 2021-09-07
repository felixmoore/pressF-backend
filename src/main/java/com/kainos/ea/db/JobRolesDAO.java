package com.kainos.ea.db;

import com.kainos.ea.objects.JobRole;
import java.util.List;
import java.util.Optional;

import com.kainos.ea.objects.JobRoleResponsibilities;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

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

  @SqlUpdate("INSERT INTO JobRoles (JobTitle, JobSpecification, JobCapability, JobDiscipline, JobBand, JobCompetencies, JobProfileLink) \n" +
          "VALUES (:jobTitle\n" +
          "\t\t, :jobSpecification\n" +
          "\t\t(SELECT JobCapabilityID FROM JobCapability WHERE JobCapability = :jobCapability),\n" +
          "\t\t(SELECT JobDisciplineID FROM JobDiscipline WHERE JobDiscipline = :jobDiscipline),\n" +
          "\t\t(SELECT JobBandID FROM JobBand WHERE JobBand = :jobBand),\n" +
          ");")
  boolean addJobRole(@Bind("jobTitle") String jobTitle, @Bind("jobSpecification") String jobSpecification, @Bind("jobCapability") String jobCapability, @Bind("jobDiscipline") String jobDiscipline,
                     @Bind("jobBand") String jobBand);
}
