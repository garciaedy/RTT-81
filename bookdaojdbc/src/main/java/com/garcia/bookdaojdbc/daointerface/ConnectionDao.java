package com.garcia.bookdaojdbc.daointerface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionDao {
	
	//create a connection object to connect to the DB
	static Connection con = null;
	
	
	//create a protected statement
	protected PreparedStatement ps =null;

	//create a protected resultSet
	protected ResultSet rs = null;
	
	
	//create connection to DB which is a return type of a methos.. if we had a string it would return a string
	
	//connects to books database
		public static Connection getConnection() {
			final String dburl="jdbc:mysql://localhost:3306/books";
			final String dbuser="root";
			final String dbpassword= "Aaron510";
			
			try {
				con= DriverManager.getConnection(dburl,dbuser,dbpassword);
				System.out.println("Connected Database Successfully");
			
			}catch(SQLException e){
				System.out.println(e);
				e.printStackTrace();
				
			}
				return con;
			}
		
		public void disconnect()
		   {
		      try {
		         if(rs != null)
		         {
		            rs.close();
		         }
		         if(ps != null)
		         {
		            ps.close();
		         }
		         if(con != null)
		         {
		            con.close();
		         }
		        
		      }catch (Exception e) {
		        
		      
			}
			
		}
		
	}