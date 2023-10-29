package com.garcia.bookdaojdbc;
import java.util.ArrayList;

import com.garcia.bookdaojdbc.controller.BookDaoImpl;
import com.garcia.bookdaojdbc.daointerface.*;
import com.garcia.bookdaojdbc.model.Book;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{

		//We test APP HERE
		//this has access to the public  mehopds
		BookDao obj= new BookDaoImpl();

		// System.out.println(obj.getAllBooks());

		//         ArrayList<Book> booklist = new ArrayList<Book>();
		//         booklist.add(new Book(7,104, "Advanced Java Development"));
		//         obj.saveBook(booklist);
		//         System.out.println("=======Book inserted successfully=======");
		//          
		//         obj.deleteBook(7);
		//         System.out.println("=========Book deleted successfully=======");

		
		//create book obj with bookname and isbn
		Book bookObj= new Book(150,"Intermediate Java Book");

		//         we are updating the id to what we pass in
		obj.updateBook(bookObj,4);
		System.out.println("=====Book updated successfully=====");
	}
}
