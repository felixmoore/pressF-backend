package com.kainos.ea.authentication;

import com.kainos.ea.objects.User;
import io.dropwizard.auth.Authorizer;

public class UserAuthoriser implements Authorizer<User> {

  @Override
  public boolean authorize(User user, String role) {
    return user.getRole() != null && user.getRole().equals(role);
  }
}