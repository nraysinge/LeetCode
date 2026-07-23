package i.createclass.hw_24nov;

import java.util.Scanner;

public class Netflix {
	
	int username, subscription, phone, help_phone;
	String password, movie_Category, language, 
	search_option,country,email,city;
	public void propertiesOfNetflix() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Username");
		username=sc.nextInt();
		System.out.println("Enter Your password");
		password=sc.next();		
		System.out.println("Enter Your phonenumber");
		phone=sc.nextInt();
		System.out.println("enter subscription amount");
		subscription=sc.nextInt();
		System.out.println("Enter Your help_phone");
		help_phone=sc.nextInt();
		System.out.println("Enter Your movie_Category");
		movie_Category=sc.next();
		System.out.println("Enter Your language");
		language=sc.next();
		System.out.println("Enter Your country");
		country=sc.next();
		System.out.println("Enter Your email");
		email=sc.next();
		System.out.println("Enter Your city");
		city=sc.next();
				
		sc.close();
	}
	
	public void showPropertiesOfNetflix() {
		
		System.out.println("Your user id is :- "+username);
		System.out.println("Your password is :- "+password);
		System.out.println("Your phone no is :- "+phone);
		System.out.println("Your subscription amt is :- "+subscription);
		System.out.println("Your help_phone is :- "+help_phone);
		System.out.println("Your movie_Category is :- "+movie_Category);
		System.out.println("Your choosen language is :- "+language);
		System.out.println("Your country is :- "+country);
		System.out.println("Your email id is :- "+email);
		System.out.println("Your city is :- "+city);
	}

}
