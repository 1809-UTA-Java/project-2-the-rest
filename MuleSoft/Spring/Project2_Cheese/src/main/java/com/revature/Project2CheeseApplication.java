package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project2CheeseApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project2CheeseApplication.class, args);
		/*AbstractApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		CheeseDao dao = context.getBean("cheeseDao", CheeseDao.class);
		
		System.out.println(dao.viewCheese());
		context.close();*/
	}
}
