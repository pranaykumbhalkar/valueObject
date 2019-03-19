package com.cropin.services.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 14/12/18
 */

@Embeddable
public class SKU extends BaseValueObject{

    private Integer sku;

    public SKU() {
    }

    public SKU(Integer sku) {
        this.sku = sku;
    }

    public Integer getSku() {
        return sku;
    }
}
