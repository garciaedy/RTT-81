package com.garcia.bookdaojdbc.model;

// we can create private methods to suye 

public class Book {

	private int id;
	private int isbn;
	private String bookName;
	
	//contructor  allow us to build different object from the class
	public Book() {
		this.isbn = 0;
		this.bookName = "";
	}
	
	//pojo plain old java object
	public Book(int isbn, String bookName) {
		super();
		
		this.isbn = isbn;
		this.bookName = bookName;
		
	}
	
	public Book(int id, int isbn, String bookName) {
		super();
		this.id =id;
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

	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", bookName=" + bookName + "]";
	}
	
}
