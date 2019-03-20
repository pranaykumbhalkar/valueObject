package com.github.pranaykumbhalkar.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 14/12/18
 */

@Embeddable
public class SequenceNumber extends BaseValueObject{

    private Integer sequenceNumber;

    public SequenceNumber() {
    }

    public SequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }
}
