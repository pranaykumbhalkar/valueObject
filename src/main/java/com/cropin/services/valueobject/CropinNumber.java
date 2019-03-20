package com.cropin.services.valueobject;

import javax.persistence.Embeddable;

@Embeddable
public class CropinNumber extends BaseValueObject {

    private String cropinNumber;

    public CropinNumber(String cropinNumber) {
        this.cropinNumber = cropinNumber;
    }

    public CropinNumber() {
    }

    public String getCropinNumber() {
        return cropinNumber;
    }
}
