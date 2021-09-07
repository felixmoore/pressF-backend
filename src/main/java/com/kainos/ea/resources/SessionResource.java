package com.kainos.ea.resources;

import com.kainos.ea.db.SessionDAO;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/api/sessions")
public class SessionResource {
  private final SessionDAO sessionDAO;

  public SessionResource(SessionDAO sessionDAO) {
    this.sessionDAO = sessionDAO;
  }

  @GET
  @Path("/")
  public List<Map<String, String>> getAllSessions() {
    return sessionDAO.getSessions();
  }

  @POST
  @Path("/{id}")
  public void createSession(@PathParam("id") String sessionID, String cookie) {
    System.out.println("Create attempt");
    sessionDAO.addSession(sessionID, cookie);
  }

  @GET
  @Path("/{id}")
  public Optional<Map<String, String>> getSession(@PathParam("id") String sessionID) {
    System.out.println("Get request: " + sessionDAO.getSession(sessionID));
    Map<String, String> retrieved = sessionDAO.getSession(sessionID);
    if (retrieved.size() > 0) {
      return Optional.of(retrieved);
    } else {
      return Optional.empty();
    }
  }

  @DELETE
  @Path("/{id}")
  public void deleteSession(@PathParam("id") String sessionID) {
    sessionDAO.deleteSession(sessionID);
  }
}
