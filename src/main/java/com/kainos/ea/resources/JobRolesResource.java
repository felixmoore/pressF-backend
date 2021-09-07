package com.kainos.ea.resources;

import com.kainos.ea.db.JobRolesDAO;
import com.kainos.ea.objects.*;
import io.swagger.annotations.Api;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Defines API endpoints for the system.
 */
@Api
@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class JobRolesResource {

  private final JobRolesDAO jobRolesDAO;

  public JobRolesResource(JobRolesDAO jobRolesDAO) {
    this.jobRolesDAO = jobRolesDAO;
  }

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
    return jobRolesDAO.addJobRole(jobRole.getJobTitle(), jobRole.getJobSpecification(), jobRole.getJobCapabilityId(), jobRole.getJobDisciplineId(), jobRole.getJobBandId(), jobRole.getJobCompetencies());
  }

  @POST
  @Path("/addjobband")
  @Consumes(MediaType.APPLICATION_JSON)
  public boolean addJobRole(JobBand jobBand) {
    return jobRolesDAO.addJobBand(jobBand.getJobBand(), jobBand.getJobBandTraining());
  }

  @POST
  @Path("/addjobcapability")
  @Consumes(MediaType.APPLICATION_JSON)
  public boolean addJobRole(JobCapability jobCapability) {
    return jobRolesDAO.addJobCapability(jobCapability.getJobCapability());
  }

  @GET
  @Path("/getjobband")
  public List<JobBand> getJobBand() { return jobRolesDAO.getJobBand(); }

  @GET
  @Path("/getjobcapability")
  public List<JobCapability> getJobCapability() { return jobRolesDAO.getJobCapability(); }

  @GET
  @Path("/getjobdiscipline")
  public List<JobDiscipline> getJobDiscipline() { return jobRolesDAO.getJobDiscipline(); }
}
