package com.commerce.visualizer.service;

import com.commerce.visualizer.repository.EconomicActivityLocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EconomicActivityLocalServiceImpl implements IEconomicActivityLocal {

    @Autowired
    private EconomicActivityLocalRepository economicActivityLocalRepository;
}
