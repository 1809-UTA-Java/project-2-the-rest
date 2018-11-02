package com.revature;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.models.Bread;
import com.revature.repository.BreadRepository;

@SpringBootApplication
public class BreadVendorApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BreadVendorApplication.class, args);
		BreadRepository repository = context.getBean(BreadRepository.class);
		
		Bread b;
		//b = (Bread) repository.findByType("bread");
		
		//System.out.println(b.toString());
		/*try(AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext(DataConfiguration.class)){
		
		BreadService service = context.getBean(BreadService.class);
		
		//Bread bread = new Bread()
		 
		}*/
		 
	
	}
}
