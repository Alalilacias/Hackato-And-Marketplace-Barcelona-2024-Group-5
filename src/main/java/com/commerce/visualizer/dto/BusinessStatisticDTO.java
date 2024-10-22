package com.commerce.visualizer.dto;

public record BusinessStatisticDTO(
        String id,
        String neighborhoodName,
        int businessesPerNeighborhood,
        int businessDiversityPerNeighborhood,
        double proportionOfOutstandingBusinesses,
        double averageBusinessAge,
        double averageLastModificationYear,
        double averageBusinessValue,
        int geographicBusinessDensity,
        double averageDistanceBetweenBusinesses,
        String predominantCategory,
        double predominantCategoryRatio,
        Integer businessesOlderThan10Years,
        int businessesCreatedLast5Years,
        int smallBusinesses,
        int mediumBusinesses,
        int largeBusinesses,
        double averageModificationYears,
        int highValueBusinesses
) {}
