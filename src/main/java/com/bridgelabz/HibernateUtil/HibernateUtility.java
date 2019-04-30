package com.bridgelabz.HibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bridgelabz.pojo.User;


public class HibernateUtility {
	static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionFactory() {
		Configuration configuration=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class);
		return sessionFactory=configuration.buildSessionFactory();
	}
}
