package com.kainos.ea.resources;

import com.kainos.ea.db.JobRolesDAO;
import com.kainos.ea.objects.JobBand;
import com.kainos.ea.objects.JobCapability;
import com.kainos.ea.objects.JobDiscipline;
import com.kainos.ea.objects.JobRole;
import io.swagger.annotations.Api;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Defines API endpoints for the JobRoles section of the system.
 */
@Api
@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class JobRolesResource {

  private final JobRolesDAO jobRolesDAO;

  public JobRolesResource(JobRolesDAO jobRolesDAO) {
    this.jobRolesDAO = jobRolesDAO;
  }

  /**
   * Returns a JobRole based on given ID.
   *
   * @param jobRoleID - passed in URL.
   * @return JobRole
   */
  @GET
  @Path("/getjobroledetails/{id}")
  public JobRole getJobRoleDetails(@PathParam("id") int jobRoleID) {
    JobRole jobRole = findSafely(jobRoleID);
    jobRole.setJobRoleResponsibilities(jobRolesDAO.getJobResponsibilities(jobRoleID));
    return jobRole;
  }

  private JobRole findSafely(int jobRoleID) {
    return jobRolesDAO.getJobRoleDetails(jobRoleID).orElseThrow(() -> new NotFoundException("Job role not found."));
  }

  @GET
  @Path("/getjobroles")
  public List<JobRole> getJobRoles() {
    return jobRolesDAO.getJobRoles();
  }

  @POST
  @Path("/addjobrole")
  @Consumes(MediaType.APPLICATION_JSON)
  public boolean addJobRole(JobRole jobRole) {
    return jobRolesDAO.addJobRole(jobRole.getJobTitle(), jobRole.getJobSpecification(), jobRole.getJobCapabilityId(), jobRole.getJobDisciplineId(),
        jobRole.getJobBandId(), jobRole.getJobCompetencies());
  }

  @POST
  @Path("/addjobband")
  @Consumes(MediaType.APPLICATION_JSON)
  public boolean addJobBand(JobBand jobBand) {
    return jobRolesDAO.addJobBand(jobBand.getJobBand(), jobBand.getJobBandTraining());
  }

  @POST
  @Path("/addjobcapability")
  @Consumes(MediaType.APPLICATION_JSON)
  public boolean addJobCapability(JobCapability jobCapability) {
    return jobRolesDAO.addJobCapability(jobCapability.getJobCapability());
  }

  @GET
  @Path("/getjobband")
  public List<JobBand> getJobBand() {
    return jobRolesDAO.getJobBand();
  }

  @GET
  @Path("/getjobcapability")
  public List<JobCapability> getJobCapability() {
    return jobRolesDAO.getJobCapability();
  }

  @GET
  @Path("/getjobdiscipline")
  public List<JobDiscipline> getJobDiscipline() {
    return jobRolesDAO.getJobDiscipline();
  }
}
