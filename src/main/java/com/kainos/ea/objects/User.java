package com.kainos.ea.objects;

import java.security.Principal;

/**
 * Java representation of User database table.
 */
public class User implements Principal {
  private final String email;
  private final String role;

  public User(String email, String role) {
    this.email = email;
    this.role = role;
  }

  public String getEmail() {
    return email;
  }

  public String getRole() {
    return role;
  }

  @Override
  public String getName() {
    return getEmail();
  }
}
