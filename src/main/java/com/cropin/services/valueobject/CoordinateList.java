package com.cropin.services.valueobject;

import javax.persistence.Embeddable;


@Embeddable
public class CoordinateList extends BaseValueObject {


    private String coordinates;

    public CoordinateList() {
    }

    public CoordinateList(String coordinates) {
        if (validateCoordinates(coordinates)) {
            this.coordinates = coordinates;
        }else {
            //throw new InvalidDataFormatException(new InvalidDataDetails(ExceptionMessage.COORDINATE_PROPERTY,coordinates,ExceptionMessage.COORDINATE_CODE,ExceptionMessage.COORDINATE_MESSAGE));
        }
    }

    private static Boolean validateCoordinates(String coordinates){
        try {
            String[] coordinateList = coordinates.split(",");
            for (String coordinate : coordinateList){
                String[] latLong = coordinate.split(" ");
                if (!Coordinate.validateCoordinate(new Double(latLong[0]),new Double(latLong[1])))
                    return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getCoordinates() {
        return coordinates;
    }
}
