package com.example.demo.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.BreadModel;


@Repository
public class BreadsDao {
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public List<BreadModel> getBreads() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Breads").list();
	}
	
}
