package com.garcia.bookdaojdbc.model;

public class Book {

	private int id;
	private int isbn;
	private String bookName;
	
	public Book() {}
	
	//pojo plain old java object
	public Book(int isbn, String bookName) {
		super();
		
		this.isbn = isbn;
		this.bookName = bookName;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
}
