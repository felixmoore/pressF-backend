package com.kainos.ea.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

/**
 * Maps user details retrieved in UserDAO.getUserDetails() into a List<String>.
 * This is done to prevent passwords being stored in User objects.
 */
public class UserMapper implements RowMapper<List<String>> {
  @Override
  public List<String> map(final ResultSet resultRow, final StatementContext ctx) throws SQLException {
    List<String> userDetails = new ArrayList<>();
    userDetails.add(resultRow.getString("UserEmail"));
    userDetails.add(resultRow.getString("UserPassword"));
    userDetails.add(resultRow.getString("UserRole"));
    return userDetails;
  }
}
