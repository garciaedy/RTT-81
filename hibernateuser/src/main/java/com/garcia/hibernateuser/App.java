package com.garcia.hibernateuser;

import com.garcia.hibernateuser.controller.UserService;
import com.garcia.hibernateuser.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
// This serves to test to make sure the initial app is working 
//    User obj = new User("Garcia", "Garcia@gmail.com", "Password", 22, 100000.00,"Atlanta");
//    	System.out.println(obj.toString());
    	
    	//create an object UserSerice that invoke the createTable method from the UserService.java
    	
    	UserService obj = new UserService();
    	obj.createUserTable();
    	
    	
    }
   
    
}
