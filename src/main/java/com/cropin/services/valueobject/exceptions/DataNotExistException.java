package com.cropin.services.valueobject.exceptions;

public class DataNotExistException extends RuntimeException {
    public static final String ERROR_CODE_RECORD_NOT_EXIST = "SMF_NOT_EXIST";
    private ErrorDetails errorDetails;

    public DataNotExistException(ErrorDetails errorDetails){
        errorDetails.setCode(ERROR_CODE_RECORD_NOT_EXIST);
        this.errorDetails = errorDetails;
    }

    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }
}
