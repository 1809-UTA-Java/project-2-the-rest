package com.revature.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.revature.models.Bread;
import com.revature.repository.BreadRepository;

@Service
public class BreadService {
		
		@Autowired
		private BreadRepository dao;
		
		
		public List<Bread> getAllBreads(){
			List<Bread> bread = dao.findAll();
			return bread;
		}
		
		@Transactional
		public Bread getBread(String type){
		
			Bread bread;
			bread = dao.findByType(type);
			bread.setStock();
			
			if(bread.getStock() == 0){bread.restockStock();}
			
			return bread;
		}
		
		
	
	
}
