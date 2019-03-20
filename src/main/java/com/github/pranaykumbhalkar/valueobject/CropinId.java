package com.github.pranaykumbhalkar.valueobject;


import javax.persistence.Embeddable;

@Embeddable
public class CropinId extends BaseValueObject {

    private Integer id;

    public CropinId(Integer id) {
        this.id = id;
    }

    public CropinId() {
    }

    public Integer getId() {
        return id;
    }
}
