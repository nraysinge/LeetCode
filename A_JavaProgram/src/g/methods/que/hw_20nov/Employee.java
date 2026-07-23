package g.methods.que.hw_20nov;

import java.util.Scanner;

public class Employee {
	String name;
	float salaary;
	public void accepetEmpData() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Name :- ");
		name=sc.nextLine();
		System.out.println("Enter the Employee Age :- ");
		salaary=sc.nextFloat();	
		
		sc.close();
		}
	
	public void showEmpData() {
		
		System.out.println("Employee Name is :- "+name);
		System.out.println("Employee Sallary is :- "+salaary);
	}

}
