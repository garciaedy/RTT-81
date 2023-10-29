package com.garcia.hibernateuser.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.garcia.hibernateuser.model.User;


public class UserService {
//first method we need to create is
	
	public void createUserTable() {
		
		//The very first obj we need to create is session factory and session and transaction
		//This items objs will read our config file and create our table
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();		
		Session session = factory.openSession();
		Transaction t =session.beginTransaction();
		
		User user = new User();
		t.commit();
		
		System.out.println("Successfully creatyed users table");
		
		factory.close();
		session.close();
		
		
	}
}
