package com.github.pranaykumbhalkar.valueobject;


import javax.persistence.Embeddable;

@Embeddable
public class ClientId extends BaseValueObject {

    private String clientId;

    public ClientId(String clientId) {
        this.clientId = clientId;
    }

    public ClientId() {
    }

    public String getClientId() {
        return clientId;
    }
}
