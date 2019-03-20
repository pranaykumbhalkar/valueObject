package com.github.pranaykumbhalkar.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 27/12/18
 */

@Embeddable
public class LanguageCode {

    private String languageCode;

    public LanguageCode() {
    }

    public LanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }
}
