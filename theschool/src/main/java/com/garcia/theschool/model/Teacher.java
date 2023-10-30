package com.garcia.theschool.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Teacher  implements Serializable{

	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacherId;
	private String salary;
	private String teachername;

	@ManyToOne
	@JoinColumn(name = "fk_deptid")
	private Department department;


	public Teacher() {}

	public Teacher(String salary, String teachername) {
		super();
		this.salary = salary;
		this.teachername = teachername;
	}


	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", salary=" + salary + ", teachername=" + teachername
				+ ", department=" + department + "]";
	}





}
