package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Cheese;

@Repository
public interface CheeseDao extends JpaRepository<Cheese, String>{
	
	Cheese findByName(String name);

	
}
