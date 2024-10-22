package com.commerce.visualizer.utils;

import com.commerce.visualizer.dto.BusinessStatisticDTO;
import com.commerce.visualizer.model.BusinessStatistic;

public class BusinessStatisticMapper {
    public BusinessStatisticDTO toDTO(BusinessStatistic businessStatistic) {
        return new BusinessStatisticDTO(
                businessStatistic.getId(),
                businessStatistic.getNeighborhoodName(),
                businessStatistic.getBusinessesPerNeighborhood(),
                businessStatistic.getBusinessDiversityPerNeighborhood(),
                businessStatistic.getProportionOfOutstandingBusinesses(),
                businessStatistic.getAverageBusinessAge(),
                businessStatistic.getAverageLastModificationYear(),
                businessStatistic.getAverageBusinessValue(),
                businessStatistic.getGeographicBusinessDensity(),
                businessStatistic.getAverageDistanceBetweenBusinesses(),
                businessStatistic.getPredominantCategory(),
                businessStatistic.getPredominantCategoryRatio(),
                businessStatistic.getBusinessesOlderThan10Years(),
                businessStatistic.getBusinessesCreatedLast5Years(),
                businessStatistic.getSmallBusinesses(),
                businessStatistic.getMediumBusinesses(),
                businessStatistic.getLargeBusinesses(),
                businessStatistic.getAverageModificationYears(),
                businessStatistic.getHighValueBusinesses()
        );
    }
}
