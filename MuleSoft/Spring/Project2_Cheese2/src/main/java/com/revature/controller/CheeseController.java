package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
