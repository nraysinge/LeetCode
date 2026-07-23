package u.poly.overrideng;

import java.util.Scanner;

public class Manager {
	public double calculateSalary() {
		System.out.println("\n -:Manager Salary Slip:- ");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Manager name:- ");
		String name=sc.next();
		System.out.print("Enter Manager Age:- ");
		int age=sc.nextInt();
		System.out.print("Enter Manager Basic Salary:- ");
		double basic_salary=sc.nextDouble();
		System.out.print("Enter Manager City:- ");
		String city =sc.next();
		
		double da,hra,tra,pt,pf;
		
		da=(basic_salary*5)/100;
		hra=(basic_salary*10)/100;
		tra=(basic_salary*15)/100;
		pt=(basic_salary*10)/100;
		pf=(basic_salary*12)/100;
		
		double gross_salary=basic_salary+da+hra+tra;
		double net_salary=gross_salary-(pf+pt);
		
		
		System.out.println("\nManeger name is:- "+name);
		System.out.println("Manager age is:- "+age);
		System.out.println("Manager City is:- "+city);
		System.out.println("Manager Grass Salary is:- "+gross_salary);
		System.out.println("Maneger Net Salary is:- "+net_salary);
		
		
		
		
		System.out.print("\nManeger Basic Salary is:- ");
		return basic_salary;
	}

}
//String name, post;
//double Bacic_Salary;
//double da, hra, tra, pt, pf, gross_salary, net_salary;