package com.garcia.hibernateuser;

import com.garcia.hibernateuser.controller.UserService;
//import com.garcia.hibernateuser.model.User;

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
    	
    	
     
    	//create an object UserSerice 
    	 UserService obj = new UserService();
    	//...that invoke the createUserTable method from the UserService.java
    	 //This will read the createUserTable method step by step 
    	 
//    	obj.createUserTable();
//    	 obj.createUser();
//    	 obj.findUser(11);
    	 obj.updateUser(3);
    	
    	
    	//obj.useFromClause();
    	//obj.useOrderByClause();
    	//obj.useMultiSelectExpressionClause();
    	//obj.useGroupByClause();
    	//obj.useNameParameters();
      
    	
    	
    	
    	//hqlObj.useFromClause();
    	
    	//hqlObj.useWhereClause();
    	
    	// hqlObj.useOrderByClause();
    	
//    	hqlObj.useMultiSelectExClause();
    	
    	//hqlObj.useGroupByClause();
    	//hqlObj.useNameParameters();
    	
    	
    }
   
    
}
