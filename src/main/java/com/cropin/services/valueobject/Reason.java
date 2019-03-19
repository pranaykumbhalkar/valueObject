package com.cropin.services.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 14/12/18
 */

@Embeddable
public class Reason extends BaseValueObject{

    private Integer reason;

    public Reason() {
    }

    public Reason(Integer reason) {
        this.reason = reason;
    }

    public Integer getReason() {
        return reason;
    }
}
