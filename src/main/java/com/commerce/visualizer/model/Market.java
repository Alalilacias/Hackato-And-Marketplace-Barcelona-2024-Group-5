package com.commerce.visualizer.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "markets")
@AllArgsConstructor
@NoArgsConstructor
public class Market {
    @Id
    private String registerId;

    private String name;

    private LocalDateTime created;

    private LocalDateTime modified;

    // Address information
    private Address address;

    // Values information
    private Value value;

    // Secondary filters
    private SecondaryFilter secondaryFilter;

    // Geo-coordinates
    private GeoCoordinate geoCoordinate;
}
