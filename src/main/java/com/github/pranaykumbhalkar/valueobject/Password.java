package com.github.pranaykumbhalkar.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 27/12/18
 */

@Embeddable
public class Password {

  private String password;

  public Password() {
  }

  public Password(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }
}
