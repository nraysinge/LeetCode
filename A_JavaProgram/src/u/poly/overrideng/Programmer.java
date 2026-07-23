package u.poly.overrideng;

import java.util.Scanner;

public class Programmer {

		public double calculateSalary() {
			System.out.println("\n -:Programmer Salary Slip:- ");
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Programmer name:- ");
			String name=sc.next();
			System.out.print("Enter Programmer Age:- ");
			int age=sc.nextInt();
			System.out.print("Enter Programmer Basic Salary:- ");
			double basic_salary=sc.nextDouble();
			System.out.print("Enter Programmer City:- ");
			String city =sc.next();
			
			double da,hra,tra,pt,pf;
			
			da=(basic_salary*5)/100;
			hra=(basic_salary*10)/100;
			tra=(basic_salary*15)/100;
			pt=(basic_salary*10)/100;
			pf=(basic_salary*12)/100;
			
			double gross_salary=basic_salary+da+hra+tra;
			double net_salary=gross_salary-(pf+pt);
			
			
			System.out.println("\nProgrammer name is:- "+name);
			System.out.println("Programmer age is:- "+age);
			System.out.println("Programmer City is:- "+city);
			System.out.println("Programmer Grass Salary is:- "+gross_salary);
			System.out.println("Programmer Net Salary is:- "+net_salary);
			
			
			
			
			System.out.print("\nProgrammer Basic Salary is:- ");
			return basic_salary;
	}
}
