package com.cropin.services.valueobject.exceptions;


import com.cropin.services.valueobject.enums.EntityTypes;

public class ErrorDetails {
    private EntityTypes entityType;
    private String message;
    private Integer id;
    private String clientId;
    private String code;

    public ErrorDetails(EntityTypes entityType, final String message, final Integer id, final String clientId) {
        this.entityType = entityType;
        this.message = message;
        this.id = id;
        this.clientId = clientId;
    }

    public EntityTypes getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityTypes entityType) {
        this.entityType = entityType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
