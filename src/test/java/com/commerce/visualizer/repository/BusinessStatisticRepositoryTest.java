package com.commerce.visualizer.repository;

import static org.assertj.core.api.Assertions.assertThat;

import com.commerce.visualizer.model.BusinessStatistic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

@DataMongoTest
@ActiveProfiles("test")  // Use a separate test profile if needed
public class BusinessStatisticRepositoryTest {

    @Autowired
    private BusinessStatisticRepository businessStatisticRepository;

    @BeforeEach
    void setUp() {
        businessStatisticRepository.deleteAll(); // Clear the repository before each test
    }

    @Test
    void whenSavingBusinessStatistic_thenCanBeFound() {
        BusinessStatistic businessStatistic = new BusinessStatistic(
                "1",
                "Gracia",
                100,
                50,
                0.7,
                5.5,
                3.2,
                20000,
                150,
                1.5,
                "Comercio",
                0.6,
                20,
                10,
                30,
                50,
                20,
                4.5,
                5
        );

        // Save the entity
        businessStatisticRepository.save(businessStatistic);

        // Retrieve the entity
        Optional<BusinessStatistic> found = businessStatisticRepository.findById("1");
        assertThat(found).isPresent();
        assertThat(found.get().getNomBarri()).isEqualTo("Gracia");
    }

    @Test
    void whenDeletingBusinessStatistic_thenItShouldNotExist() {
        BusinessStatistic businessStatistic = new BusinessStatistic(
                "1",
                "Gracia",
                100,
                50,
                0.7,
                5.5,
                3.2,
                20000,
                150,
                1.5,
                "Comercio",
                0.6,
                20,
                10,
                30,
                50,
                20,
                4.5,
                5
        );

        // Save the entity
        businessStatisticRepository.save(businessStatistic);

        // Delete the entity
        businessStatisticRepository.delete(businessStatistic);

        // Verify deletion
        Optional<BusinessStatistic> found = businessStatisticRepository.findById("1");
        assertThat(found).isNotPresent();
    }
}
