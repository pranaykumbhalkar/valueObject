package com.cropin.services.valueobject;

import java.math.BigDecimal;
import javax.persistence.Embeddable;

@Embeddable
public class Area extends BaseValueObject {

    private BigDecimal area;

    public Area() {
    }

    public Area(BigDecimal area) {
        this.area = area;
    }

    public BigDecimal getArea() {
        return area;
    }
}
