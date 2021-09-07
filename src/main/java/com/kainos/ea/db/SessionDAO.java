package com.kainos.ea.db;

import java.util.List;
import java.util.Map;
import org.jdbi.v3.sqlobject.config.KeyColumn;
import org.jdbi.v3.sqlobject.config.ValueColumn;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

public interface SessionDAO {
  @SqlQuery("SELECT * FROM Sessions;")
  @KeyColumn("SessionID")
  @ValueColumn("Cookie")
  List<Map<String, String>> getSessions();

  @SqlUpdate("DELETE FROM Sessions WHERE SessionID = :sessionID")
  void deleteSession(@Bind("sessionID") String sessionID);

  @SqlQuery("SELECT SessionID, Cookie FROM Sessions WHERE SessionID = :sessionID")
  @KeyColumn("SessionID")
  @ValueColumn("Cookie")
  Map<String, String> getSession(@Bind("sessionID") String sessionID);

  @SqlUpdate("INSERT INTO Sessions(SessionID, Cookie) VALUES (:sessionID, :cookie)")
  void addSession(@Bind("sessionID") String sessionID, @Bind("cookie") String cookie);
}
