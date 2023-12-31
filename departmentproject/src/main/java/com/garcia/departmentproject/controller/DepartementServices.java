package com.garcia.departmentproject.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.garcia.departmentproject.model.Department;

public class DepartementServices {

	public void createDepartmentTable() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
	Transaction tran =  session.beginTransaction();
	
	Department department = new Department(null, null, null);
	tran.commit();
	
	System.out.println("Sucessully created department table");
	factory.close();
	session.close();
	
	
	}
}
