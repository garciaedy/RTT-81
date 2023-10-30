package com.garcia.theschool.util;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.garcia.theschool.model.Department;
import com.garcia.theschool.model.Teacher;

public class GenerateDataUtil {

	public void CreateDataManyToOne() {
		
		Session session =HibernateUtil.getConecction();
		Transaction t = session.beginTransaction();
		
		
		//create departments
		Department dep = new Department();
		dep.setDeptName("IT");
		
		Department dep2 = new Department();
		dep2.setDeptName("HR");
		
		//Create Teacher
		
		Teacher t1 = new Teacher();
		t1.setDepartment (dep);
		t1.setSalary ("1000"); 
		t1.setTeachername("MHaseeb");
		
		Teacher t2 = new Teacher();
		t2.setDepartment (dep); 
		t2.setSalary ("2200"); 
		t2.setTeachername ("Shahparan");
		
		Teacher t3 = new Teacher();
		t3.setDepartment (dep2);
		t3.setSalary ("30000"); 
		t3.setTeachername ("James");
		
		Teacher t4 = new Teacher();
		t4.setDepartment (dep2);
		t4.setSalary ("40000");
		t4.setTeachername ("Joseph");
		
		//Store.Department in database
		
		session.persist(dep);
		session.persist(dep2);
		
		session.persist(t1);
		session.persist(t2);
		session.persist(t3);
		session.persist(t4);
		session.close();
	
		
		
		
	}
}
