package com.hsbc;

public class Book {

	String bname;
//	String author;
	int price;
	Author author;
	
	
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Book() {
		super();
	}
	public Book(String bname, Author author, int price) {
		super();
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
//	public String getAuthor() {
//		return author;
//	}
//	public void setAuthor(String author) {
//		this.author = author;
//	}
	
	
	public String toString() {
		return "Book [bname=" + bname + ", author=" + author + ", price=" + price + "]";
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
		
}
