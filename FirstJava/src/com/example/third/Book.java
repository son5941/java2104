package com.example.third;

public class Book {

	private String BookName;
	private String author;
	
	public Book() {
	
	
	} // end of default constructor

	public Book(String BookName, String author) {
		this.BookName = BookName;
		this.author = author;
		
	}// end of book
	
	
	
	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public void ShowBookInfo() {
		System.out.println(BookName + ", " + author);
	}
} // end of class
