package com.kainos.ea.resources;

import com.kainos.ea.db.SessionDAO;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/api/sessions")
public class SessionResource {
  private final SessionDAO sessionDAO;

  public SessionResource(SessionDAO sessionDAO){ this.sessionDAO = sessionDAO; };

//  @GET
//  @Path("/")
//  public List<String> getAllSessions(){
//    return {};
//  }

  @POST
  @Path("/{id}")
  public void createSession(@PathParam("id") String sessionID){
    System.out.println(sessionID);
  }

  @GET
  @Path("/{id}")
  public void getSession(@PathParam("id") String sessionID){
    System.out.println("GOT: "+sessionID);
  }
}
