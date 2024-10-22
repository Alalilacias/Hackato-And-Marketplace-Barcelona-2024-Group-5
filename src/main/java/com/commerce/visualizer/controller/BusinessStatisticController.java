package com.commerce.visualizer.controller;


import com.commerce.visualizer.dto.BusinessStatisticDTO;
import com.commerce.visualizer.dto.InitialFormDTO;
import com.commerce.visualizer.service.interfaces.BusinessStatisticService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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

    @Tag(name = "Obtain data business statistics", description = "Returns detailed business statistics data for a given business statistic ID")
    @Operation(summary = "Get business statistic by ID", description = "Retrieve detailed business statistics for a specified ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved business statistic", content = @Content(mediaType = "application/json", schema = @Schema(implementation = BusinessStatisticDTO.class))),
            @ApiResponse(responseCode = "404", description = "Business statistic not found")
    })
    @GetMapping("/businessStatistics/{id}")
    public ResponseEntity<BusinessStatisticDTO> readActivity(@PathVariable String id){
        BusinessStatisticDTO businessStatisticDTO = businessStatisticService.readBusinessStatistic(id);

        return ResponseEntity.ok(businessStatisticDTO);
    }

    @Tag(name = "Obtain all business statistics", description = "Returns a list of all business statistics data")
    @Operation(summary = "Get all business statistics", description = "Retrieve all business statistics data")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved list of business statistics", content = @Content(mediaType = "application/json", schema = @Schema(implementation = BusinessStatisticDTO.class)))
    })
    @GetMapping("/businessStatistics")
    public ResponseEntity<List<BusinessStatisticDTO>> readAllActivities(){
        List<BusinessStatisticDTO> businessStatisticDTOS = businessStatisticService.readAllBusinessStatistic();

        return ResponseEntity.ok(businessStatisticDTOS);
    }

    @Tag(name = "Obtain neighborhoods and activities", description = "Returns data of neighborhoods and their corresponding activities")
    @Operation(summary = "Get neighborhoods and activities", description = "Retrieve data of neighborhoods and their corresponding business activities")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved neighborhoods and activities data", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InitialFormDTO.class)))
    })
    @GetMapping("/neighborhoodsAndActivities")
    public ResponseEntity<InitialFormDTO> readNeighborhoodsAndActivities(){
        InitialFormDTO initialFormDTOS = businessStatisticService.readNeighborhoodsAndActivities();

        return ResponseEntity.ok(initialFormDTOS);
    }
}
