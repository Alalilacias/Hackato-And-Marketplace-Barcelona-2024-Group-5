package com.commerce.visualizer.repository;

import com.commerce.visualizer.model.CadastralLocal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastralLocalRepository extends MongoRepository<CadastralLocal, String> {
}
