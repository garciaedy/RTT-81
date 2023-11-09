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
		Session session =factory.openSession();
		Transaction t = session.beginTransaction();
		
		User uOne = new User();
		uOne.setEmail("hassebe@gmail.com");
		uOne.setFullName("Moh Haseeb");
		uOne.setPassword("has123");
		uOne.setSalary(2000.99);
		uOne.setAge(20);
		uOne.setCity("NYC");
		
		User uTwo = new User();
		
		uTwo.setEmail("james@gmail.com");
		uTwo.setFullName("james Santana");
		uTwo.setPassword("james123");
		uTwo.setSalary(2060.69);
		uTwo.setAge(25);
		uTwo.setCity("Dallas");
		
		User uThree = new User();
		uThree.setEmail("Shahparan@gmail.com");
		uThree.setFullName("AH Shahparan");
		uThree.setPassword("Shahparan123");
		uThree.setSalary(3060.69);
		uThree.setAge(30);
		uThree.setCity("Chicago");
		
		User uEight = new User();
		uEight.setEmail("HellowWorlf.com");
		uEight.setFullName("Hello World");
		uEight.setPassword("HelloW");
		uEight.setSalary(30160.69);
		uEight.setAge(22);
		uEight.setCity("Bama");
		
		User uFour = new User("Christ","christ@gmail.com","12345",35,3500.00,"Atlanta");
		User uFive = new User("Sid", "sid@gmail.com","4567",25,4000.00,"Louisville");
		User uSix = new User("Edy", "edy@gmail.com","12567",33,40000.00,"ATL");
		session.persist(uOne);
		session.persist(uTwo);
		session.persist(uThree);
		session.persist(uFour);
		session.persist(uFive);
		session.persist(uSix);
		session.persist(uEight);
		
		t.commit();
		
		System.out.println("Sucessfully Saved");
		factory.close();
		session.close();
	}
	
	public void findUser(int id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session =factory.openSession();
		Transaction t = session.beginTransaction();
		
		User u = session.get(User.class, id);
		System.out.println("Fullname" + u.getFullName());
		System.out.println("Email" + u.getEmail());
		System.out.println("Password" + u.getPassword());
		t.commit();
		factory.close();
		session.close();
	}
	
	public void updateUser(int id){
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session =factory.openSession();
		Transaction t = session.beginTransaction();
		
		User u =new User();
		u.setId(id);
		u.setFullName("homee Lopiee");
		u.setEmail("onLop@gmail.com");
		u.setPassword("Bahahaha");
		u.setCity("Norcross");
		u.setAge(32);
		u.setSalary(80000);
		
		
		session.merge(u);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
	
	public void deleteUser(int id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session =factory.openSession();
		Transaction t = session.beginTransaction();
		
		User user =new User();
		
		
		user.setId(id);
		session.remove(user);
		t.commit();
		session.close();
		factory.close();		
		
	}
	
}
