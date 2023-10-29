package com.garcia.bookdaojdbc.controller;

import java.util.List;

import com.garcia.bookdaojdbc.daointerface.BookDao;
import com.garcia.bookdaojdbc.daointerface.ConnectionDao;
import com.garcia.bookdaojdbc.model.Book;

public class BookDaoImpl extends ConnectionDao implements BookDao{
	//we want to us the getConenction method from: ConnectionDao
		// we do so by adding extends ConnectionDao and implements BookDao


	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
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
