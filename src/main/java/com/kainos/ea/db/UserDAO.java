package com.kainos.ea.db;

import java.util.List;
import org.jdbi.v3.sqlobject.SingleValue;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

public interface UserDAO {
  @SqlQuery("SELECT UserEmail, UserPassword, UserRole FROM Users " +
            "WHERE UserEmail = :userEmail AND UserPassword = :userPassword")
  @UseRowMapper(UserMapper.class)
  @SingleValue
  List<String> getUserDetails(@Bind("userEmail") String userEmail, @Bind("userPassword") String userPassword);
}
