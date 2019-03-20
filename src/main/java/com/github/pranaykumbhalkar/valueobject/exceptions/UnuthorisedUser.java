package com.github.pranaykumbhalkar.valueobject.exceptions;

/**
 * Created by Pranay on 24/12/18
 */


public class UnuthorisedUser extends RuntimeException {

  public static final String ERROR_CODE_USER_UNAUTHORIZED = "USER_UNAUTHORIZED";
  private String message;

  public UnuthorisedUser(final String message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
