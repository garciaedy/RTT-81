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

		//get database and authenticate

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
		/*    while(result.next()) {
        	//can use the column name or position(the number
        	String firstName = result.getString("firstName");
        	String lastName = result.getString("lastname");
        	String email = result.getString("email");
        	int reportsTo= result.getInt("reportsTo");
        	int employeeNumber= result.getInt("employeeNumber");
        	System.out.println(employeeNumber + "| " + firstName + " " + lastName + " | " + email + " | " + reportsTo);



        }    */
		//        connection.close();


		//we must call the GetEmployeebyId method in the main Method
		//gives connection to database, passing an id

		// getEmployeeById(1504, connection);

		// insertEmployee(connection);
		updateEmployee(connection);
		//          updateExtension(connection);


	}// end of main method

	//create a new method we are using public static bc we are in the main app class
	//where the main method is. The method is static all method
	// creating new method to get employee by id
	public static void getEmployeeById(int id, Connection conn) throws SQLException {
		PreparedStatement ps = conn.prepareStatement(SqlQueries.GetEmployeeById);
		ps.setInt(1, id);
		ResultSet result= ps.executeQuery();
		while(result.next()) {
			String firstName = result.getString("firstName");
			String email = result.getString("email");
			String jobTitle= result.getString("jobTitle");
			int reportsTo= result.getInt("reportsTo");
			System.out.println(firstName + " | " + email + " | " + jobTitle + " | " + reportsTo);

		}



	}

	public static void insertEmployee(Connection connection) throws SQLException {
		String sqlQuery = "INSERT INTO employees (officeCode, firstName, lastName, email, extension, reportsTo, VacationHours, employeeNumber, jobTitle) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = connection.prepareStatement(sqlQuery);

		// Set the parameters. Each question mark in the SQL statement must have a corresponding setter method call.
		ps.setInt(1, 6);
		ps.setString(2, "Edy");
		ps.setString(3, "Garcia");  // Corrected the lastName
		ps.setString(4, "hsaha@gmail.com"); // Corrected the email
		ps.setString(5, "1234"); // Corrected the extension
		ps.setInt(6, 1143); // Corrected reportsTo
		ps.setInt(7, 9);  // Corrected VacationHours
		ps.setInt(8, 1115); // Corrected employeeNumber
		ps.setString(9, "Developer"); // Corrected jobTitle

		// Execute the update
		int affectedRows = ps.executeUpdate();

		// Print the number of affected rows
		System.out.println(affectedRows + " row(s) affected.");
	}
	public static void updateEmployee(Connection connection) throws SQLException{
		String selectSql= "UPDATE employees set firstName = ?, lastName=? where employeeNumber=?";

		PreparedStatement stmt = connection.prepareStatement(selectSql);
		stmt.setString(1, "Ms." + "Tonya");
		stmt.setString(2, "Thomas");
		stmt.setInt(3,1114);
		stmt.executeUpdate();
		// executeUpdate() returns the number of rows affected
		int rowsAffected = stmt.executeUpdate();

		// Print the number of affected rows
		System.out.println("Updated " + rowsAffected + " rows.");

		// It's a good practice to close PreparedStatement to release resources immediately,
		// Java try-with-resources can also be used to automatically close it.
		stmt.close();
	}
	public static void updateExtension(Connection connection) throws SQLException {
		String query = "UPDATE employees set extension = ? where officeCode = ?";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, "5698");
		ps.setString(2, "2");

		// executeUpdate() returns the number of rows affected
		int rowsAffected = ps.executeUpdate();

		// Print the number of affected rows
		System.out.println("Number of rows updated: " + rowsAffected);

		// Closing the PreparedStatement resource
		ps.close();
	}

}//end of app class
