package m.constructor_2dec;

import java.util.Scanner;

public class Book {
		private String title, author;
		private double prise;
	
		public Book() {
			setTitle("nk");
			setAuthor("nk");
			setPrise(0);
			}
//		public Book(String t, String a) {
//			setTitle(t);
//			setAuthor(a);
//		}
//		public Book(String t, String a, double p) {
//			setTitle(t);
//			setAuthor(a);
//			setPrise (p);
//			
//		}
		
		public void acceptData() {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter title name :- ");
			setTitle(sc.next());
			System.out.print("Enter Author name:- ");
			setAuthor(sc.next());
			System.out.print("Enter book prise:- ");
			setPrise(sc.nextDouble());
			System.out.println("------------------");
		}
		public void setTitle(String t) {
			title=t;
		}
		public void setAuthor(String a) {
			author=a;
		}
		public void setPrise(double p) {
			prise=p;
		}
		public String getTitle() {
			return title;
		}
		public String getAuthor() {
			return author;
		}
		public double getPrise() {
			return prise;
		}
		
		public void showData() {
			System.out.println("Title:- "+getTitle());
			System.out.println("author:- "+getAuthor());
			System.out.println("prise:- "+getPrise());
			System.out.println("-----------------------");
		}
		
		public static void main(String[] args) {
			Book b1=new Book();
			b1.acceptData();
			b1.showData();
			Book b2=new Book();
			b2.showData();
			
		}
}
