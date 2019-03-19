package com.cropin.services.valueobject;

import javax.persistence.Embeddable;

@Embeddable
public class Coordinate extends BaseValueObject {

    private Double latitude;
    private Double longitude;

    public Coordinate() {
    }

    public Coordinate(Double latitude, Double longitude) {
        if (validateCoordinate(latitude,longitude)) {
            this.latitude = latitude;
            this.longitude = longitude;
        }else {
            //throw new InvalidDataFormatException(new InvalidDataDetails(ExceptionMessage.COORDINATE_PROPERTY,latitude+" + "+latitude,ExceptionMessage.COORDINATE_CODE,ExceptionMessage.COORDINATE_MESSAGE));
        }
    }

    public static Boolean validateCoordinate(Double latitude, Double longitude) {
        return ((-90 <= latitude) && (latitude <= 90) && (-180 <= longitude) && (longitude <= 180));
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
}
