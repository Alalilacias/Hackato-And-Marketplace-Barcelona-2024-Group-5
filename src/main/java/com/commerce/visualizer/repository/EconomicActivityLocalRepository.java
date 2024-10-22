package com.commerce.visualizer.repository;

import com.commerce.visualizer.model.EconomicActivityLocal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface EconomicActivityLocalRepository extends MongoRepository<EconomicActivityLocal, String> {
}
