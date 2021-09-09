package com.kainos.ea.resources;

import com.kainos.ea.db.UserDAO;
import com.kainos.ea.objects.User;
import io.dropwizard.auth.Auth;
import io.swagger.annotations.Api;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Defines API endpoints for the User section of the system.
 */
@Api
@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
  private final UserDAO userDAO;

  public UserResource(UserDAO userDAO) {
    this.userDAO = userDAO;
  }

  /**
   * Attempts to authenticate user based on details sent in POST request.
   *
   * @param user - attempted login details from POST request header.
   * @return user - either a valid user or an Optional.empty() - handled by Dropwizard as error 401.
   */
  @POST
  @Path("/login")
  @Produces(MediaType.APPLICATION_JSON)
  public User getLoginResponse(@Auth User user) {
    return user;
  }
}
