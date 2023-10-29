package com.garcia.hibernateuser.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//THIS IS A POJO/MODEL CLASS, NEEDS COSNTRUCTOR
//import from jakarta
//all annotations above a field refer to that field

//add table 
@Entity
@Table(name = "user")
public class User {
// created a Pojo class
	@Column(name ="user_id")
	//instance variables, for id use object class
		//START NOTE
		//column name for id will be "user_id
	//2. final annotation change the column name from the table.. we want to specify the column name
	//1. we want to set id as the primary id
	//IDENTITY automatically assigns primary key

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
	//END NOTE

    private String fullName;
    private String email;
    private String password;
    private int age;
    private double salary; 
    private String city;
	
   // Empty constructor
  //create an empty constructor.
  	//then create a constructor with parameters minus id as it will be auto generated by using the source
    public User() {}

    public User(String fullName, String email, String password, int age, double salary, String city) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.age = age;
        this.salary = salary;
        this.city = city;
    }

    // ... Getters and Setters ...

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // ... rest of the getters and setters ...

    @Override
    public String toString() {
        return "User [id =" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password + ", age="
                + age + ", salary=" + salary + ", city=" + city + "]";
    }
}
