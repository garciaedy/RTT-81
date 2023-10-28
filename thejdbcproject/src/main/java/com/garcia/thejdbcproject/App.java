package com.garcia.thejdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	//optional, legacy code 
    	//will find class inside maven dependency 
    	//will connect us to the database, and it gets the driver which
    	//allows us to do that, 
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        
        //create string url
        String url= "jdbc:mysql://localhost:3306/classicmodels";
        
        //enter username and password you used for sql, to authenticate into
        //the workbench
        String user="root";
        String password="Aaron510";
        
        Connection connection = DriverManager.getConnection(url,user,password);
        
  // we are using the classicmodels db
        
//selecting all employeees from employee table
     
        
        String selectSql = "Select * from employees";
        
        //create statement and import from java.SQL package
        Statement stmt= connection.createStatement();
        
        //when this statement is executed, it query database and return records
        //from emp table and saving into result variable
        ResultSet result= stmt.executeQuery(selectSql);
        
        
        //store the column first name for every record, and stores into name
        while(result.next()) {
        	//can use the column name or position(the number
        	String firstName = result.getString("firstName");
        	String lastName = result.getString("lastname");
        	String email = result.getString("email");
        	int reportsTo= result.getInt("reportsTo");
        	int employeeNumber= result.getInt("employeeNumber");
        	System.out.println(employeeNumber + "| " + firstName + " " + lastName + " | " + email + " | " + reportsTo);
        	
        	
        	
        }
//        connection.close();
        
    }// end of main method
    
    //create a new method we are using public static bc we are in the main app class 
    //where the main method is. The method is static all method
   
    // creating new method to get employee by id
    
    public static void GetEmployeeById(int id, Connection conn) throws SQLException {
    	PreparedStatement ps = conn.prepareStatement(SqlQueries.GetEmployeeById);
    	
    	ps.setInt(1, id);
    	
    	ResultSet result= ps.executeQuery();
    	

    	
    }
    
    
}//end of app class
