package com.commerce.visualizer.service.interfaces;

import com.commerce.visualizer.dto.BusinessStatisticDTO;
import com.commerce.visualizer.dto.InitialFormDTO;
import com.commerce.visualizer.model.BusinessStatistic;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusinessStatisticService {
    BusinessStatisticDTO readBusinessStatistic(String id);
    List<BusinessStatisticDTO> readAllBusinessStatistic();
    InitialFormDTO readNeighborhoodsAndActivities();
}
