package com.garcia.bookdaojdbc.daointerface;

import java.util.List;

import com.garcia.bookdaojdbc.model.Book;

public interface BookDao {

	//adding all signature methods

	List<Book> getAllBooks();

	void saveBook(List<Book> bookList);

	boolean deleteBook(int id);

	boolean updateBook(Book book, int id);


}

