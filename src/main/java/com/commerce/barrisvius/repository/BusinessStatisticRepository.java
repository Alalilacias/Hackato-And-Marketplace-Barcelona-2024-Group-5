package com.commerce.barrisvius.repository;

import com.commerce.barrisvius.model.BusinessStatistic;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessStatisticRepository extends MongoRepository<BusinessStatistic, String> {

}
