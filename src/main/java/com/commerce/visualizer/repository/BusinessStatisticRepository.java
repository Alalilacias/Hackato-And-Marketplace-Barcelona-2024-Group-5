package com.commerce.visualizer.repository;

import com.commerce.visualizer.model.BusinessStatistic;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessStatisticRepository extends MongoRepository<BusinessStatistic, String> {

}
