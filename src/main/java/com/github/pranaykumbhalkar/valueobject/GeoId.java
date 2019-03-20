package com.github.pranaykumbhalkar.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 14/12/18
 */

@Embeddable
public class GeoId extends BaseValueObject{

    private Integer geoId;

    public GeoId() {
    }

    public GeoId(Integer geoId) {
        this.geoId = geoId;
    }

    public Integer getGeoId() {
        return geoId;
    }
}
