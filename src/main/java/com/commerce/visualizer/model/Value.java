package com.commerce.visualizer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "values")
public class Value {
    @Id
    private String id;
    private String attributeId;
    private String category;
    private String attributeName;
    private String value;
    private Boolean outstanding;
    private String description;

    // Getters and Setters
}

