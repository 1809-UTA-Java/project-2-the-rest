package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Produce;

@Repository
public interface ProduceDao extends JpaRepository<Produce, Integer> {
	
	Produce findByProduceType(String produceType);
	
}
