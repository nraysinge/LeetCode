package k.encapsulation_27nov;

import java.util.Scanner;

public class Book {
	
	private String Title, Author, Publisher;
	private int ISBN; 
	private float price;
		
	public void setTitle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Book Titel");
		Title=sc.nextLine();
		sc.close();
	}
		
	public void setAuthor() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Book Author");
		Author=sc.nextLine();
		sc.close();
	}
	
	public void setPublisher() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Book Publisher");
		Publisher=sc.nextLine();
		sc.close();
	}
		
	public void setIsbn() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Book ISBN");
		ISBN=sc.nextInt();
		sc.close();
	}
	
	public void setPrise() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Book price");
		price=sc.nextFloat();
		sc.close();
		}
		
		public String getTitle() {
			return Title;
		}
		public String getAuthor() {
			return Author;
		}
		public String getPublisher() {
			return Publisher;
		}
		public int getIsbn() {
			return ISBN;
		}
		public float getPrice() {
			return price;
		}
		

	
//	public void showPropertiesOfBook() {
//		
//		System.out.println("Book Titel is:- "+Title);
//		System.out.println("Book Author name is:- "+Author);
//		System.out.println("Book isbn no is:- "+ISBN);
//		System.out.println("Book publishdate is:- "+PublishDate);
//		System.out.println("Book number of copy is:- "+NumberOfCopy);
//		System.out.println("Book Prise is:- "+price);
//		System.out.println("Book Title is:- "+Title);
//		System.out.println("The book pusher is :- "+Publisher);
//	}
	

}
