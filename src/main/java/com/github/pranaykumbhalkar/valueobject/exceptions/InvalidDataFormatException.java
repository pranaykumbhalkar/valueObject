package com.github.pranaykumbhalkar.valueobject.exceptions;

/**
 * Created by Pranay on 9/1/19
 */


public class InvalidDataFormatException extends RuntimeException {

  public static final String ERROR_CODE_INVALID_DATA_FORMAT = "INVALID_DATA_FORMAT";
  private InvalidDataDetails invalidDataDetails;

  public InvalidDataFormatException(){

  }

  public InvalidDataFormatException(InvalidDataDetails invalidDataDetails){
    this.invalidDataDetails = invalidDataDetails;
  }

  public InvalidDataDetails getInvalidDataDetails() {
    return invalidDataDetails;
  }

  public void setInvalidDataDetails(InvalidDataDetails invalidDataDetails) {
    this.invalidDataDetails = invalidDataDetails;
  }
}
