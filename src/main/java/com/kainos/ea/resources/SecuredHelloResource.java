package com.kainos.ea.resources;

import com.kainos.ea.objects.User;
import io.dropwizard.auth.Auth;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("secured_hello")
public class SecuredHelloResource {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String getGreeting(@Auth User user) {
    return "Hello world!";
  }

  @RolesAllowed("Admin")
  @GET
  @Path("admin")
  @Produces(MediaType.TEXT_PLAIN)
  public String getAdminGreeting(@Auth User user) {
    return "Hello admin!";
  }

  @RolesAllowed("Employee")
  @GET
  @Path("employee")
  @Produces(MediaType.TEXT_PLAIN)
  public String getEmployeeGreeting(@Auth User user) {
    return "Hello employee!";
  }
}