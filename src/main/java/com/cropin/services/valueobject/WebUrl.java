package com.cropin.services.valueobject;

import javax.persistence.Embeddable;

/**
 * Created by Pranay on 27/12/18
 */


@Embeddable
public class WebUrl extends BaseValueObject {

    private String webUrl;

    public WebUrl() {
    }

    public WebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getWebUrl() {
        return webUrl;
    }
}
