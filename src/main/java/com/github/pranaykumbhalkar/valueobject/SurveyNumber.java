package com.github.pranaykumbhalkar.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 14/12/18
 */

@Embeddable
public class SurveyNumber extends BaseValueObject{

    private String surveyNumber;

    public SurveyNumber() {
    }

    public SurveyNumber(String surveyNumber) {
        this.surveyNumber = surveyNumber;
    }

    public String getSurveyNumber() {
        return surveyNumber;
    }
}
