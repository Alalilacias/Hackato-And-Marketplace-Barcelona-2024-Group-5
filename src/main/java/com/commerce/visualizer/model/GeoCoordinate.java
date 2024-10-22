package com.commerce.visualizer.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "geolocations")
public class GeoCoordinate {

    private Double epgs25831X;
    private Double epgs25831Y;
    private Double epgs4326Lat;
    private Double epgs4326Lon;

    // Getters y setters
}
