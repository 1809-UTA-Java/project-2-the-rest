package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Cheese;
import com.revature.repository.CheeseDao;

@RestController
public class CheeseController {

	@Autowired
	CheeseDao dao;
	
	@GetMapping("/cheese")
	public List<Cheese> getAll(){
		List<Cheese> cheese = dao.findAll();
		return cheese;
	}
	
/*	@Transactional
	@GetMapping("/cheese/{name}")
	public Cheese getByName(@PathVariable("Name") String Name){
		Cheese item = dao.findByName(Name);
		item.subStock(1);
		return item;
	}*/
	
	@Transactional
	@GetMapping("/cheese/{Name}")
	public Cheese getByName(@PathVariable("Name") String Name){
		Cheese item = dao.findByName(Name);
		item.subStock(1);
		return item;
	}
}
