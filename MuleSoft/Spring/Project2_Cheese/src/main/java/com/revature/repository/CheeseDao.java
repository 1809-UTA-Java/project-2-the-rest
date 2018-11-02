package com.revature.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Cheese;

@Repository
public class CheeseDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<Cheese> viewCheese(){
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Cheese").list();
	}
}
