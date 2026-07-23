package c.squ.cube.hw_14nov;

import java.util.Scanner;

public class XEmployee11Nov25 {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		int id;
		String name,post;
		double salary;
		
		System.out.println("Enter The Employee ID");
		id=sc.nextInt();
		
		System.out.println("Enter The Employee Name");
		name=sc.next();
		
		System.out.println("Enter The Employee Post");
		post=sc.next();
		
		System.out.println("Enter The Employee Salary");
		salary=sc.nextDouble();
		
		
		System.out.println("----------- Employee Detials ---------");
		System.out.println("Employee ID :- "+id);
		System.out.println("Employee Name :- "+name);
		System.out.println("Employee Post :- "+post);
		System.out.println("Employee Salary :- "+salary);
		
		
		
		
		sc.close();
	}

}
