package com.github.pranaykumbhalkar.valueobject;

import javax.persistence.Embeddable;

@Embeddable
public class ObjectName extends BaseValueObject {

    private String objectName;

    public ObjectName(String objectName) {
        this.objectName = objectName;
    }

    public ObjectName() {
    }

    public String getObjectName() {
        return objectName;
    }
}
