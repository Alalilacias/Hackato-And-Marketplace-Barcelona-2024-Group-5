package com.commerce.visualizer.controller;


import com.commerce.visualizer.dto.BusinessStatisticDTO;
import com.commerce.visualizer.dto.InitialFormDTO;
import com.commerce.visualizer.service.interfaces.BusinessStatisticService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/barrisVius")
@CrossOrigin(origins = "http://localhost:9000")
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
