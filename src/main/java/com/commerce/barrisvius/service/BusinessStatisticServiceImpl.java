package com.commerce.barrisvius.service;

import com.commerce.barrisvius.dto.BusinessStatisticDTO;
import com.commerce.barrisvius.dto.InitialFormDTO;
import com.commerce.barrisvius.exceptions.BusinessStatisticNotFoundException;
import com.commerce.barrisvius.model.BusinessStatistic;
import com.commerce.barrisvius.repository.BusinessStatisticRepository;
import com.commerce.barrisvius.service.interfaces.BusinessStatisticService;
import com.commerce.barrisvius.utils.BusinessStatisticMapper;
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
