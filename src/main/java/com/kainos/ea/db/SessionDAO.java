package com.kainos.ea.db;

import com.kainos.ea.objects.JobRole;
import java.util.List;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

public interface SessionDAO {
  @SqlQuery("SELECT * FROM Sessions;")
  List<String> getSessions();

//  void deleteSession();

  @SqlQuery("SELECT * FROM Sessions WHERE SessionID = :sessionID;")
  String getSession(@Bind("sessionID") String sessionID);

//  void addSession();
}
