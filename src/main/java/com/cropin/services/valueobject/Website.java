package com.cropin.services.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 27/12/18
 */


@Embeddable
public class Website extends BaseValueObject {

    private String website;

    public Website() {
    }

    public Website(String website) {
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }
}
