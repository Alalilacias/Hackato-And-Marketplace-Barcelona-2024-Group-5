package com.commerce.visualizer.controller;

import com.commerce.visualizer.dto.BusinessStatisticDTO;
import com.commerce.visualizer.dto.InitialFormDTO;
import com.commerce.visualizer.service.interfaces.BusinessStatisticService;
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

    @GetMapping("/businessStatistics/{id}")
    public ResponseEntity<BusinessStatisticDTO> readActivity(@PathVariable String id){
        BusinessStatisticDTO businessStatisticDTO = businessStatisticService.readBusinessStatistic(id);

        return ResponseEntity.ok(businessStatisticDTO);
    }

    @GetMapping("/businessStatistics")
    public ResponseEntity<List<BusinessStatisticDTO>> readAllActivities(){
        List<BusinessStatisticDTO> businessStatisticDTOS = businessStatisticService.readAllBusinessStatistic();

        return ResponseEntity.ok(businessStatisticDTOS);
    }

    @GetMapping("/neighborhoodsAndActivities")
    public ResponseEntity<InitialFormDTO> readNeighborhoodsAndActivities(){
        InitialFormDTO initialFormDTOS = businessStatisticService.readNeighborhoodsAndActivities();

        return ResponseEntity.ok(initialFormDTOS);
    }
}
