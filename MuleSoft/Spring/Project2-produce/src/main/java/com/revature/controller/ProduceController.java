package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Produce;
import com.revature.repository.ProduceDao;

@RestController
public class ProduceController {
	@Autowired
	ProduceDao dao;

	@GetMapping("/produce")
	public List<Produce> getAll() {
		List<Produce> produces = dao.findAll();
		return produces;
	}
	
//	@GetMapping("/produce/{name}")
//	public Produce getByName(@PathVariable("name") String name) {
//		return dao.findByName(name);
//	}
	
}
