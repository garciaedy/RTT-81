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
	public void createUser() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		User uone = new User();
		uone.setEmail("hasseb@gmail.com");
		uone.setFullname("Moh Haseeb");
		uone.setPassword ("has123");
		uone.setSalary (2000.99);
		uone.setAge (20);
		uone.setCity ("NYC");
		
		User uTwo = new User();
		uTwo. setEmail("James@gmail.com");
		uTwo. setFullname ("James Santana"); 
		uTwo.setPassword ("James123"); 
		uTwo.setSalary (2060.69);
		uTwo.setAge(25);
		uTwo. setCity ("Dallas");
		
		User uThree = new User();
		uThree.setEmail ("Shahparan@gmail.com");
		uThree.setFullname ("AH Shahparan");
		uThree.setPassword ("Shahparan123"); uThree. setSalary (3060.69);
		uThree.setAge (30);
		uThree.setCity ("Chicago");
		
		User ufour = new User("Christ", "christ@gmail.com", "12345",35, 35000.00, "Atlanta");
		User ufive = new User("Sid", "sid@gmail.com", "4567", 25,4000.00, "Louisville");
	
		session.persist (uone); 
		session. persist (uTwo); 
		session. persist (uThree);
		session. persist (ufour); 
		session. persist (ufive);
		
		t.commit();
		
		System.out.println("Successfully Saved"); 
		factory.close(); 
		session. close();
	}
}
