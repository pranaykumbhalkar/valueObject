package com.cropin.services.valueobject;

import java.math.BigDecimal;
import javax.persistence.Embeddable;

@Embeddable
public class Quantity extends BaseValueObject {

    private BigDecimal quantity;

    public Quantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Quantity() {
    }

    public BigDecimal getQuantity() {
        return quantity;
    }
}
