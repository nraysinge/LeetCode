package g.methods.que.hw_20nov;

import java.util.Scanner;

public class Student {
	
	String name;
	float age;
	public void accseptTheData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Student Name :- ");
		name=sc.next();
		System.out.println("Enter The age of Student :- ");
		age=sc.nextFloat();
		sc.close();
	}
	
//	public void ageOfStudent() {
//		
//		System.out.println("Enter The Student Age is:- ");
//		float d=sc.nextFloat();
//	}
	
	public void showStudentData() {
		
		System.out.println("Student Name is :- "+name);
		System.out.println("Student Age is :- "+age);
	}

}
