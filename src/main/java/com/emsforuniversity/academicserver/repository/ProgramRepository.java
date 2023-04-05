package com.emsforuniversity.academicserver.repository;

import com.emsforuniversity.academicserver.model.Program;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepository extends MongoRepository<Program, Integer> {
}