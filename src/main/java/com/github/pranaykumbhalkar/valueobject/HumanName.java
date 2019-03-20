package com.github.pranaykumbhalkar.valueobject;

import javax.persistence.Embeddable;

@Embeddable
public class HumanName extends BaseValueObject {

    private String humanName;

    public HumanName() {
    }

    public HumanName(String humanName) {
        this.humanName = humanName;
    }

    public String getHumanName() {
        return humanName;
    }
}
