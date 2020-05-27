package com.java.thirtydayscode;
import java.util.Scanner;

public class AbstractClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner scanner = new Scanner(System.in);
	        String title = scanner.nextLine();
	        String author = scanner.nextLine();
	        int price = scanner.nextInt();
	        scanner.close();

	        Book book = new MyBook(title, author, price);
	        book.display();

	}

}

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book {
	
	private String title;
    private String author;
    private int price;

	MyBook(String title, String author, int price) {
		super(title, author);
		this.title=title;
		this.author=author;
		this.price = price;
	}

	@Override
	void display() {
		
		System.out.println("Title: "+ title);
		System.out.println("Author: "+ author);
		System.out.println("Price: "+ price);
		
	}
	
}
