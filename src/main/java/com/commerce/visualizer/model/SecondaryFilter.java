package com.commerce.visualizer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "secondaryFilters")
public class SecondaryFilter {
    @Id
    private Long id;
    private String name;
    private String fullpath;
    private Integer tree;
    private Long asiaId;
  
}
