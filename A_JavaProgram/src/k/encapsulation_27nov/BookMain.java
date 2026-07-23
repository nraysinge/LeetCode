package k.encapsulation_27nov;

public class BookMain {
	public static void main(String[] args) {
	Book b1=new Book();
	b1.setTitle();
	b1.setAuthor();
	b1.setIsbn();
	b1.setPublisher();
	b1.setPrise();
	
	System.out.println("Book title is:- "+b1.getTitle());
	System.out.println("Book Author:- "+b1.getAuthor());
	}
	
}
