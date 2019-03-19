package com.cropin.services.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 27/12/18
 */


@Embeddable
public class Fax extends BaseValueObject {

    private String fax;

    public Fax() {
    }

    public Fax(String fax) {
        this.fax = fax;
    }

    public String getFax() {
        return fax;
    }
}
