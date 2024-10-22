package com.commerce.barrisvius.service.interfaces;

import com.commerce.barrisvius.dto.BusinessStatisticDTO;
import com.commerce.barrisvius.dto.InitialFormDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BusinessStatisticService {
    BusinessStatisticDTO readBusinessStatistic(String id);
    List<BusinessStatisticDTO> readAllBusinessStatistic();
    InitialFormDTO readNeighborhoodsAndActivities();
}
