package com.github.pranaykumbhalkar.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 14/12/18
 */

@Embeddable
public class Day extends BaseValueObject{

    private Integer day;

    public Day() {
    }

    public Day(Integer day) {
        this.day = day;
    }

    public Integer getDay() {
        return day;
    }
}
