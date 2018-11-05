package com.revature.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Bread;

@Repository
public interface BreadRepository extends JpaRepository<Bread,String>{

Bread findByType(String type);
	
	public List<Bread> findByTypeLike(String type);
	
	public List<Bread> findByTypeContaining(String type);
	
	public List<Bread> findByTypeStartingWith(String type);
	
	public List<Bread> findByTypeEndingWith(String type);
	
	public List<Bread> findByTypeIgnoreCase(String type);


}