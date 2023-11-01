package com.garcia.theschool.util;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.garcia.theschool.model.Department;
import com.garcia.theschool.model.Department1M;
import com.garcia.theschool.model.Teacher;
import com.garcia.theschool.model.Teacher1M;

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
	
	public static void createDataOneToMany() {
		Session session =HibernateUtil.getConecction();
		Transaction t = session.beginTransaction();
		
		Teacher1M t1 = new Teacher1M();
		t1.setSalary ("100"); 
		t1.setTeachername("Haseeb");
		
		Teacher1M t2 = new Teacher1M();
		t2.setSalary ("2200"); 
		t2.setTeachername ("Jenny Finch");
		
		Teacher1M t3 = new Teacher1M();
		t3.setSalary ("30000"); 
		t3.setTeachername ("James");
		
		Teacher1M t4 = new Teacher1M();
		t4.setSalary ("40000");
		t4.setTeachername ("Sif Joseph");
		
		Teacher1M t5 = new Teacher1M();
		t5.setSalary ("200");
		t5.setTeachername ("Ali");
		
		//added tecaher entity object to a klist 
		
		List<Teacher1M> teacherList = new ArrayList<Teaacher1M>();
		
		teacherList.add(t1);
		teacherList.add(t2);
		teacherList.add(t3);
		teacherList.add(t4);
		teacherList.add(t5);
		
		
		session.persist(t1);
		session.persist(t2);
		session.persist(t3);
		session.persist(t4);
		session.persist(t5);
		
		//create Department
		Department1M department = new Department1M();
		
		department.setDeptName("Development");
		department.setTeacherList(teacherList);
		
		

		
	}
}
