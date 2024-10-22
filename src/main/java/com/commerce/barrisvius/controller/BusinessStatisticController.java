package com.commerce.barrisvius.controller;

import com.commerce.barrisvius.dto.BusinessStatisticDTO;
import com.commerce.barrisvius.dto.InitialFormDTO;
import com.commerce.barrisvius.service.interfaces.BusinessStatisticService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/barrisVius")
public class BusinessStatisticController {
    @Autowired
    BusinessStatisticService businessStatisticService;

    @Tag(name = "Obtain data business stadistics", description = "Returns business statistics data, receives a business statistic id and returns the data of that business statistic")
    @GetMapping("/businessStatistics/{id}")
    public ResponseEntity<BusinessStatisticDTO> readActivity(@PathVariable String id){
        BusinessStatisticDTO businessStatisticDTO = businessStatisticService.readBusinessStatistic(id);

        return ResponseEntity.ok(businessStatisticDTO);
    }

    @Tag(name = "Obtain all business statistics", description = "Returns all business statistics data")
    @GetMapping("/businessStatistics")
    public ResponseEntity<List<BusinessStatisticDTO>> readAllActivities(){
        List<BusinessStatisticDTO> businessStatisticDTOS = businessStatisticService.readAllBusinessStatistic();

        return ResponseEntity.ok(businessStatisticDTOS);
    }

    @Tag(name = "Obtain neighborhoods and activities", description = "Returns all neighborhoods and activities")
    @GetMapping("/neighborhoodsAndActivities")
    public ResponseEntity<InitialFormDTO> readNeighborhoodsAndActivities(){
        InitialFormDTO initialFormDTOS = businessStatisticService.readNeighborhoodsAndActivities();

        return ResponseEntity.ok(initialFormDTOS);
    }
}
