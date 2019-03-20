package com.github.pranaykumbhalkar.valueobject.exceptions;



public class DataAlreadyExistException extends RuntimeException {

    public static final String ERROR_CODE_RECORD_EXIST = "SMF_EXIST";
    private ErrorDetails errorDetails;

    public DataAlreadyExistException(ErrorDetails errorDetails){
        errorDetails.setCode(ERROR_CODE_RECORD_EXIST);
        this.errorDetails = errorDetails;
    }

    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }
}
