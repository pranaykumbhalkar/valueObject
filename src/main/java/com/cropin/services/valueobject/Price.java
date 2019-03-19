package com.cropin.services.valueobject;

import com.cropin.services.valueobject.exceptions.ExceptionMessage;
import com.cropin.services.valueobject.exceptions.InvalidDataDetails;
import com.cropin.services.valueobject.exceptions.InvalidDataFormatException;
import java.math.BigDecimal;
import javax.persistence.Embeddable;


/**
 * Created by Pranay on 13/12/18
 */

@Embeddable
public class Price extends BaseValueObject {

    private BigDecimal price;

    public Price() {
    }

    public Price(BigDecimal price) {
        if (price == null || price.compareTo(new BigDecimal(0)) > 0) {
            this.price = price;
        } else {
            throw new InvalidDataFormatException(new InvalidDataDetails(ExceptionMessage.PRICE_PROPERTY,price.toString(),ExceptionMessage.PRICE_CODE,ExceptionMessage.PRICE_MESSAGE));
        }
    }

    public BigDecimal getPrice() {
        return price;
    }
}
