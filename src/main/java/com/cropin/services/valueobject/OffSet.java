package com.cropin.services.valueobject;

import java.math.BigDecimal;
import javax.persistence.Embeddable;

/**
 * Created by Pranay on 27/12/18
 */
@Embeddable
public class OffSet extends BaseValueObject {

    private BigDecimal offSet;

    public OffSet() {
    }

    public OffSet(BigDecimal offSet) {
        this.offSet = offSet;
    }

    public BigDecimal getOffSet() {
        return offSet;
    }
}
