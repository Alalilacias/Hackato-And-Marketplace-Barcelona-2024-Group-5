package com.commerce.visualizer.utils;

import com.commerce.visualizer.model.BusinessStatistic;
import com.commerce.visualizer.repository.BusinessStatisticRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Arrays;

@Slf4j
@Component
public class Initializer implements CommandLineRunner {

    @Autowired
    private BusinessStatisticRepository businessStatisticsRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void run(String... args) throws RuntimeException {
        loadBusinessStatistics();
    }

    private void loadBusinessStatistics() {
        File file = new File("src/main/resources/datasets/business_statistics.json");

        try {
            BusinessStatistic[] businessStatistics = objectMapper.readValue(file, BusinessStatistic[].class);
            log.info(Arrays.toString(businessStatistics));
            for (BusinessStatistic businessStatistic : businessStatistics) {
                businessStatisticsRepository.save(businessStatistic);
            }
            log.info("Business statistics loaded successfully");
        } catch (Exception e) {
            log.error("Error loading business statistics: {}", e.getMessage(), e);
            throw new RuntimeException("Error loading business statistics: " + e.getMessage(), e);
        }
    }
}
