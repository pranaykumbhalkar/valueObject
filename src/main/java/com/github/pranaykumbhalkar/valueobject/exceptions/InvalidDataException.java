package com.github.pranaykumbhalkar.valueobject.exceptions;

public class InvalidDataException extends RuntimeException {

    public static final String ERROR_CODE_RECORD_INACTIVE = "SMF_INACTIVE";
    private ErrorDetails errorDetails;

    public InvalidDataException(ErrorDetails errorDetails){
        errorDetails.setCode(ERROR_CODE_RECORD_INACTIVE);
        this.errorDetails = errorDetails;
    }

    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }
}
