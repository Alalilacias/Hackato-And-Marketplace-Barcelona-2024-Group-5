package com.commerce.visualizer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "addresses")
public class Address {
    @Id
    private Integer roadId;
    private String roadName;
    private Integer startStreetNumber;
    private Integer neighborhoodId;
    private String neighborhoodName;
    private Integer districtId;
    private String districtName;
    private Integer zipCode;
    private String town;
    private Boolean mainAddress;


    // Getters and Setters
}
