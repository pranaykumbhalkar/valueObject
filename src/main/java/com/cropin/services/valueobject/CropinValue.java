package com.cropin.services.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 13/12/18
 */

@Embeddable
public class CropinValue extends BaseValueObject {

    private Integer value;

    public CropinValue() {
    }

    public CropinValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
