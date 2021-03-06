package com.cropin.services.valueobject;

import com.cropin.services.valueobject.exceptions.ExceptionMessage;
import com.cropin.services.valueobject.exceptions.InvalidDataDetails;
import com.cropin.services.valueobject.exceptions.InvalidDataFormatException;
import javax.persistence.Embeddable;
import org.apache.commons.validator.routines.EmailValidator;


/**
 * Created by Pranay on 12/12/18
 */

@Embeddable
public class EmailId {

    private String emailId;

    public EmailId() {
    }

    public EmailId(String emailId) {
        if (EmailValidator.getInstance().isValid(emailId)) {
            this.emailId = emailId;
        } else {
            throw new InvalidDataFormatException(new InvalidDataDetails(ExceptionMessage.EMAIL_PROPERTY,emailId,ExceptionMessage.EMAIL_CODE,ExceptionMessage.EMAIL_MESSAGE));
        }
    }

    public String getEmailId() {
        return emailId;
    }
}
