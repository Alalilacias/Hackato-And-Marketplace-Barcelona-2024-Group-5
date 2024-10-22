package com.commerce.visualizer.service;

import com.commerce.visualizer.repository.CadastralLocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastralLocalImpl implements ICadastralLocal{

    @Autowired
    private CadastralLocalRepository cadastralLocalRepository;

}
