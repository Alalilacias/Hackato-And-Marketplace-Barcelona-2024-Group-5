package com.commerce.visualizer.service;

import com.commerce.visualizer.dto.BusinessStatisticDTO;
import com.commerce.visualizer.dto.InitialFormDTO;
import com.commerce.visualizer.exceptions.BusinessStatisticNotFoundException;
import com.commerce.visualizer.model.BusinessStatistic;
import com.commerce.visualizer.repository.BusinessStatisticRepository;
import com.commerce.visualizer.service.interfaces.BusinessStatisticService;
import com.commerce.visualizer.utils.BusinessStatisticMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessStatisticServiceImpl implements BusinessStatisticService {

    @Autowired
    private BusinessStatisticRepository businessStatisticRepository;

    BusinessStatisticMapper businessStatisticMapper = new BusinessStatisticMapper();

    @Override
    public BusinessStatisticDTO readBusinessStatistic(String id) {
        BusinessStatistic businessStatistic = businessStatisticRepository.findById(id).orElseThrow(() -> new BusinessStatisticNotFoundException(id));

        return businessStatisticMapper.toDTO(businessStatistic);
    }

    @Override
    public List<BusinessStatisticDTO> readAllBusinessStatistic() {
        return businessStatisticRepository.findAll().stream()
                .map(businessStatisticMapper::toDTO)
                .toList();
    }

    @Override
    public InitialFormDTO readNeighborhoodsAndActivities() {
        List<BusinessStatistic> businessStatistics = businessStatisticRepository.findAll();

        return businessStatisticMapper.toInitialFormDTO(businessStatistics);
    }


}
