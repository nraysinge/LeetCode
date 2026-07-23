package c.squ.cube.hw_14nov;

import java.util.Scanner;

public class XStudent11Nov25 {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Student Name :- ");
		String name =sc.next();
		
		System.out.println("Enter The Student Age :- ");
		int age =sc.nextInt();
		
		System.out.println("Enter The Student City :- ");
		String city =sc.next();
		
	
		System.out.println("----- Student Diteals ------");
		System.out.println("Name:- " + name);
		System.out.println("Age:- " + age);
		System.out.println("City:- " + city);
		
		
		sc.close();
	}

}
