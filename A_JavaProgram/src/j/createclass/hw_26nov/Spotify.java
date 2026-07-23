package j.createclass.hw_26nov;

import java.util.Scanner;

public class Spotify {
	
	String ClientId, Premium, age, a, gender, tracks, album;
		
	public void propertiesOfSpotify() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id");
		ClientId=sc.nextLine();
		
		System.out.println("priemium prise");
		Premium=sc.nextLine();
		
		System.out.println("Entr your age");
		age=sc.nextLine();
		
		System.out.println("how are you student profestional");
		a=sc.nextLine();

		System.out.println("What is your age");
		gender=sc.next();
		
		System.out.println("Which track to listen you hindi marathi english");
		tracks=sc.next();
		
		System.out.println("What is favorite your album");
		album=sc.next();
				
		sc.close();
		}
	
	public void showPropertiesOfSpotify() {
		
		System.out.println("ClientId is:- "+ClientId);
		System.out.println("Premium supcription prise is:- "+Premium);
		System.out.println("age is:- "+age);
		System.out.println("gender is:- "+gender);
		System.out.println("favorite tracks is:- "+tracks);
		System.out.println("favorite album is:- "+album);
		//System.out.println("Book Title is:- "+Title);
	}
	

}
