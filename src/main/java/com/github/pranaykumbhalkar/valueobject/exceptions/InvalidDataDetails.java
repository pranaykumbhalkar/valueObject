package com.github.pranaykumbhalkar.valueobject.exceptions;

/**
 * Created by Pranay on 9/1/19
 */

public class InvalidDataDetails {

  private String propertyName;
  private String value;
  private String code;
  private String message;

  public InvalidDataDetails(String propertyName, String value, String code, String message) {
    this.propertyName = propertyName;
    this.value = value;
    this.code = code;
    this.message = message;
  }

  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
