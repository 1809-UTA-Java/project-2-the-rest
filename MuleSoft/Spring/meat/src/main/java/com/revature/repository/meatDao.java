package com.revature.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.meat;

@Repository
public interface meatDao extends JpaRepository<meat, Integer>{
	meat findByType(String type);
}
