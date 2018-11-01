package com.revature.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Produce;

@Repository
public interface ProduceDao extends JpaRepository<Produce, Integer> {
	//Produce findAll(String name);
	//Produce findByName(String name);
}
