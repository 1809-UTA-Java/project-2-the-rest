package com.example.demo.config;

import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.BreadModel;
import com.example.demo.repository.BreadsDao;

@Configuration
@ComponentScan("com.example.demo")
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class HibernateConfig {
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource myDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		dataSource.setUrl(env.getProperty("jdbc.url"));
		dataSource.setUsername(env.getProperty("jdbc.username"));
		dataSource.setPassword(env.getProperty("jdbc.password"));
		
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(myDataSource());
		sf.setPackagesToScan(new String[] {"com.revature"});
		
		Properties hb = new Properties();
		hb.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
		sf.setHibernateProperties(hb);
		
		return sf;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sf) {
		HibernateTransactionManager htm = new HibernateTransactionManager();
		htm.setSessionFactory(sf);
		return htm;
	}
	
	@Transactional
	public BreadsDao getBreadModels(SessionFactory sf) {
	BreadsDao b = new BreadsDao();

	b.setSessionFactory(sf);
		return b;
	}

}