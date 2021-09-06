package com.kainos.ea.authentication;

import com.kainos.ea.db.UserDAO;
import com.kainos.ea.objects.User;
import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;
import io.dropwizard.auth.basic.BasicCredentials;
import java.util.List;
import java.util.Optional;

public class UserAuthenticator implements Authenticator<BasicCredentials, User> {
  UserDAO userDAO;

  public UserAuthenticator(UserDAO userDAO) {
    this.userDAO = userDAO;
  }

  @Override
  public Optional<User> authenticate(BasicCredentials credentials) throws AuthenticationException {
    // Pulls user info from the DAO, checks against the given credentials
    List<String> retrieved = userDAO.getUserDetails(credentials.getUsername(), credentials.getPassword());
    if (retrieved.get(0).equals(credentials.getUsername()) &&
        retrieved.get(1).equals(credentials.getPassword())) {
      return Optional.of(new User(credentials.getUsername(), retrieved.get(2)));
    }
    return Optional.empty();
  }
}