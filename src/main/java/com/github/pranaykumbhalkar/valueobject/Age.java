package com.github.pranaykumbhalkar.valueobject;


import com.github.pranaykumbhalkar.valueobject.exceptions.ExceptionMessage;
import com.github.pranaykumbhalkar.valueobject.exceptions.InvalidDataDetails;
import com.github.pranaykumbhalkar.valueobject.exceptions.InvalidDataFormatException;
import javax.persistence.Embeddable;

/**
 * Created by Pranay on 14/12/18
 */

@Embeddable
public class Age extends BaseValueObject{

    private Integer age;

    public Age() {
    }

    public Age(Integer age) {
        if (age > 13 && age < 125)
            this.age = age;
         else{
            throw new InvalidDataFormatException(new InvalidDataDetails(ExceptionMessage.AGE_PROPERTY,age.toString(),ExceptionMessage.AGE_CODE,ExceptionMessage.AGE_MESSAGE));
        }
    }

    public Integer getAge() {
        return age;
    }
}
