package com.github.pranaykumbhalkar.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 14/12/18
 */

@Embeddable
public class SealNumber extends BaseValueObject{

    private String sealNumber;

    public SealNumber() {
    }

    public SealNumber(String sealNumber) {
        this.sealNumber = sealNumber;
    }

    public String getSealNumber() {
        return sealNumber;
    }
}
