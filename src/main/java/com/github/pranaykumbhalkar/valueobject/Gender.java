package com.github.pranaykumbhalkar.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 14/12/18
 */

@Embeddable
public class Gender extends BaseValueObject{

    private Integer gender;

    public Gender() {
    }

    public Gender(Integer gender) {
        this.gender = gender;
    }

    public Integer getGender() {
        return gender;
    }
}
