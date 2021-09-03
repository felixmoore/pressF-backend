package com.kainos.ea.resources;

import com.kainos.ea.db.UserDAO;
import io.swagger.annotations.Api;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

;

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
}
