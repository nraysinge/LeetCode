package j.createclass.hw_26nov;

import java.util.Scanner;

public class Laptop {

	String Processor, RAM, Storage,Graphics,Display,Battery;
	int price;
		
	public void propertiesOfLaptoop() {
		Scanner sc=new Scanner(System.in);
		System.out.println("laptop procesoor");
		Processor=sc.nextLine();
		
		System.out.println("laptop RAM");
		RAM=sc.nextLine();
		
		System.out.println("laptop Storage");
		Storage=sc.nextLine();
		
		System.out.println("laptop Graphics card");
		Graphics=sc.nextLine();

		System.out.println("laptop display");
		Display=sc.nextLine();
		
		System.out.println("laptop Battery");
		Battery=sc.nextLine();
		
		System.out.println("Enter The Book price");
		price=sc.nextInt();
				
		sc.close();
		}
	
	public void showPropertiesOfLaptop() {
		
		System.out.println("laptop processor is:- "+Processor);
		System.out.println("laptop ram is:- "+RAM);
		System.out.println("laptop Storage is:- "+Storage);
		System.out.println("laptop Graphics is:- "+Graphics);
		System.out.println("laptop Display is:- "+Display);
		System.out.println("laptop Battry is:- "+Battery);
		System.out.println("laptop Prise is:- "+price);
	}
	
}
