package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.example.demo.config.HibernateConfig;
import com.example.demo.repository.BreadsDao;

@SpringBootApplication
public class Project2BreadApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project2BreadApplication.class, args);
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		BreadsDao dao = context.getBean("breadsDao", BreadsDao.class);
		
		System.out.println(dao.getBreads());
		context.close();
		
		System.out.println("Here");
	}
}
