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
        String password="password";
        
        Connection connection = DriverManager.getConnection(url,user,password);
        
        //selecting all employeees from employee table
    }
}
