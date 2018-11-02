package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Bread;
import com.revature.repository.BreadRepository;

@Service
public class BreadService {

		@Autowired
		private BreadRepository repo;
		
		public void save(Bread bread){
			this.repo.save(bread);
		}
}
