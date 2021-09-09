package com.kainos.ea.authentication;

import com.kainos.ea.objects.User;
import io.dropwizard.auth.Authorizer;

/**
 * Used to determine if a User should be able to access a protected resource.
 */
public class UserAuthoriser implements Authorizer<User> {

  @Override
  public boolean authorize(User user, String role) {
    return user.getRole() != null && user.getRole().equals(role);
  }
}