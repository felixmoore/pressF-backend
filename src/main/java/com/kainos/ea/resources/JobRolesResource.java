package com.kainos.ea.resources;

import com.kainos.ea.db.JobRolesDAO;
import com.kainos.ea.objects.JobRole;
import io.swagger.annotations.Api;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
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
    return findSafely(jobRoleID);
  }

  private JobRole findSafely(int jobRoleID) {
    return jobRolesDAO.getJobRoleDetails(jobRoleID).orElseThrow(() -> new NotFoundException("Job role not found."));
  }

  @GET
  @Path("/getjobroles")
  public List<JobRole> getJobRoles() {
    return jobRolesDAO.getJobRoles();
  }
}
