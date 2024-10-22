package com.commerce.visualizer.service.interfaces;

import com.commerce.visualizer.dto.BusinessStatisticDTO;
import com.commerce.visualizer.dto.InitialFormDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BusinessStatisticService {
    BusinessStatisticDTO readBusinessStatistic(String id);
    List<BusinessStatisticDTO> readAllBusinessStatistic();
    InitialFormDTO readNeighborhoodsAndActivities();
}
