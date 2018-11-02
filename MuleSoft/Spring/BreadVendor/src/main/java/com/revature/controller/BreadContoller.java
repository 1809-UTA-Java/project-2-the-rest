package com.revature.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Bread;
import com.revature.repository.BreadRepository;


@RestController
public class BreadContoller {

	@Autowired
	 BreadRepository dao;
	
	@GetMapping("/Bread")
	public List<Bread> getAll(){
		List<Bread> bread = dao.findAll();
		return bread;
	}
}