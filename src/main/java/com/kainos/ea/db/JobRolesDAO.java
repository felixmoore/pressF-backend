package com.kainos.ea.db;

import com.kainos.ea.objects.*;
import java.util.List;
import java.util.Optional;
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
      "SELECT JobRoleID, JobTitle, JobSpecification, jc.JobCapability, jd.JobDiscipline, jb.JobBand, jb.JobBandTraining, JobCompetencies, JobProfileLink, RecordCreated "
          + "FROM JobRoles JOIN JobBand jb ON JobRoles.JobBand = jb.JobBandID JOIN JobDiscipline jd ON JobRoles.JobDiscipline = jd.JobDisciplineID "
          + "JOIN JobCapability jc ON JobRoles.JobCapability = jc.JobCapabilityID WHERE JobRoleID = :jobRoleId")
  @RegisterBeanMapper(JobRole.class)
  Optional<JobRole> getJobRoleDetails(@Bind("jobRoleId") int jobRoleId);

  @SqlQuery("SELECT JobRoleResponsibility FROM JobRoleResponsibilities WHERE JobRoleID = :jobRoleId")
  @RegisterBeanMapper(JobRoleResponsibilities.class)
  List<JobRoleResponsibilities> getJobResponsibilities(@Bind("jobRoleId") int jobRoleId);

  @SqlUpdate("INSERT INTO JobRoles (JobTitle, JobSpecification, JobCapability, JobDiscipline, JobBand, JobCompetencies)"
      + "VALUES (:jobTitle,"
      + ":jobSpecification,"
      + ":jobCapabilityId,"
      + ":jobDisciplineId,"
      + ":jobBandId, :jobCompetencies);")
  boolean addJobRole(@Bind("jobTitle") String jobTitle, @Bind("jobSpecification") String jobSpecification,
                     @Bind("jobCapabilityId") int jobCapabilityId, @Bind("jobDisciplineId") int jobDisciplineId,
                     @Bind("jobBandId") int jobBandId, @Bind("jobCompetencies") String jobCompetencies);

  @SqlQuery("SELECT DISTINCT JobBandID, JobBand FROM JobBand")
  @RegisterBeanMapper(JobBand.class)
  List<JobBand> getJobBand();

  @SqlQuery("SELECT DISTINCT JobCapabilityID, JobCapability FROM JobCapability")
  @RegisterBeanMapper(JobCapability.class)
  List<JobCapability> getJobCapability();

  @SqlQuery("SELECT DISTINCT JobDisciplineID, JobDiscipline FROM JobDiscipline")
  @RegisterBeanMapper(JobDiscipline.class)
  List<JobDiscipline> getJobDiscipline();

  @SqlUpdate("INSERT INTO JobBand (JobBand, JobBandTraining) VALUES (:jobBand, :jobBandTraining);")
  boolean addJobBand(@Bind("jobBand") String jobBand, @Bind("jobBandTraining") String jobBandTraining);

  @SqlUpdate("INSERT INTO JobCapability (JobCapability) VALUES (:jobCapability);")
  boolean addJobCapability(@Bind("jobCapability") String jobCapability);

}