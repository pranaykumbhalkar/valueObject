package com.github.pranaykumbhalkar.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 27/12/18
 */


@Embeddable
public class Zip extends BaseValueObject{

    private String zip;

    public Zip() {
    }

    public Zip(String zip) {
        this.zip = zip;
    }

    public String getZip() {
        return zip;
    }
}
