package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.meat;
import com.revature.repository.meatDao;

@RestController
public class meatController {
	@Autowired
	meatDao dao;
	
	@GetMapping("/meats")
	public List<meat> getAll() {
		List<meat> meats = dao.findAll();
		return meats;
	}
	
	@GetMapping("/meats/{type}")
	public meat getByName(@PathVariable("type") String type) {
		return dao.findByType(type);
	}
}
