package com.github.pranaykumbhalkar.valueobject;

import javax.persistence.Embeddable;

@Embeddable
public class Flag extends BaseValueObject {

    private Boolean flag;

    public Flag(Boolean flag) {
        this.flag = flag;
    }

    public Flag() {
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}
