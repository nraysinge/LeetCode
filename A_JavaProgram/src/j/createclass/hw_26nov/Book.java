package j.createclass.hw_26nov;

import java.util.Scanner;

public class Book {
	String Title, Author, Publisher, PublishDate;
	int ISBN, NumberOfCopy, price;

//		public Book() {
//		b5.propertiesOfBook();
//	}
		
	public void propertiesOfBook() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Book Titel");
		Title=sc.nextLine();
		
		System.out.println("Enter The Book Author");
		Author=sc.nextLine();
		
		System.out.println("Enter The Book Publisher");
		Publisher=sc.nextLine();
		
		System.out.println("Enter The Book PublishDate DD-MM-YYYY Formate");
		PublishDate=sc.nextLine();

		System.out.println("Enter The Book ISBN");
		ISBN=sc.nextInt();
		
		System.out.println("Enter The Book NumberOfCopy");
		NumberOfCopy=sc.nextInt();
		
		System.out.println("Enter The Book price");
		price=sc.nextInt();
				
		sc.close();
		}
	
	public void showPropertiesOfBook() {
		System.out.println("Book Titel is:- "+Title);
		System.out.println("Book Author name is:- "+Author);
		System.out.println("Book isbn no is:- "+ISBN);
		System.out.println("Book publishdate is:- "+PublishDate);
		System.out.println("Book number of copy is:- "+NumberOfCopy);
		System.out.println("Book Prise is:- "+price);	
		System.out.println("Book Title is:- "+Title);
	}
}


//Title: The name of the book.
//Author: The name of the person who wrote the book.
//ISBN: The International Standard Book Number, used for unique identification.
//Publication Date: The year or full date the book was published.
//Number of Copies: The total count of available copies.
//Copies Checked Out: A list of who currently has a copy of the book. 
//Additional properties
//Description: A summary of the book's content.
//Pages: The total number of pages in the book.
//Publisher: The company that published the book.
//Price: The cost of the book.
//Genre: The category the book belongs to. 