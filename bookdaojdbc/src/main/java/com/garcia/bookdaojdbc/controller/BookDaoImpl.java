package com.garcia.bookdaojdbc.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.garcia.bookdaojdbc.daointerface.BookDao;
import com.garcia.bookdaojdbc.daointerface.ConnectionDao;
import com.garcia.bookdaojdbc.model.Book;


public class BookDaoImpl extends ConnectionDao implements BookDao{
	//we want to us the getConenction method from: ConnectionDao
	// we do so by adding extends ConnectionDao and implements BookDao

	@Override
	public List<Book> getAllBooks() {
		//adding connection method
		try {
			Connection connection = ConnectionDao.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs =stmt.executeQuery("SELECT * from books");
			List bookList= new ArrayList<>();
			
			while(rs.next()) {
				Book b= new Book();
				b.setId(rs.getInt("id"));
				b.setIsbn(rs.getInt("isbn"));
				
				
				b.setBookName(rs.getString("bookName"));
				bookList.add(b);
			}
			return bookList;
			}catch(SQLException ex) {
				
			ex.printStackTrace();
			System.out.printf("SQL State: %s\n%s",ex.getSQLState(), ex.getMessage());
			 
			}
			return null;
		}


	@Override
	public void saveBook(List<Book> booList) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean deleteBook(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBook(Book book, int id) {
		// TODO Auto-generated method stub
		return false;
	}


}
