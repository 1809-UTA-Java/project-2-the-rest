package com.revature.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Bread;
import com.revature.repository.BreadRepository;
import com.revature.service.BreadService;


@RestController
public class BreadContoller {
	
	@Autowired
	private BreadService breadService;
	@Autowired
	 BreadRepository dao;
	
	@GetMapping("/Bread")
	public List<Bread> getAll(){
		
		return breadService.getAllBreads();
	}
	
	@GetMapping("/Bread/{type}")
	public Bread getBread(@PathVariable String type){
		return breadService.getBread(type);
	}
	
}