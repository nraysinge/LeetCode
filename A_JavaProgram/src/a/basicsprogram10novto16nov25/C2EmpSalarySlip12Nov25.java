package a.basicsprogram10novto16nov25;

import java.util.Scanner;

public class C2EmpSalarySlip12Nov25 {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
			String name, post;
			double Bacic_Salary;
			double da, hra, tra, pt, pf, gross_salary, net_salary;
				
				System.out.println("Enter The name");
					name=sc.next();
			
				System.out.println("Enter The Post");
					post=sc.next();
				
				System.out.println("Enter The Salary");
					Bacic_Salary=sc.nextDouble();
				
					System.out.println("-----Employee Detials-----");
		
						System.out.println("Name :- "+name);
						System.out.println("Post:- "+post);
						System.out.println("Salary :- "+Bacic_Salary);
		
							da=(Bacic_Salary*5)/100;
							hra=(Bacic_Salary*15)/100;
							tra=(Bacic_Salary*5)/100;
							pt=(Bacic_Salary*10)/100;
							pf=(Bacic_Salary*5)/100;
		
						System.out.println("-----Employee Dedacation Detials-----");
						
						System.out.println("Salary Da:-  "+da);
						System.out.println("Salary hra :- " +hra);
						System.out.println("Salary tra:-  "+tra);
						System.out.println("Salary pt :- " +pt);
						System.out.println("Salary pf :- " +pf);
						
						System.out.println("-----Employee Gross Salary And Net Salary Detials-----");
						
						gross_salary=da+hra+tra+Bacic_Salary;
						
						System.out.println("Emplyee Gross Salary Is :- "+gross_salary);
						
						net_salary=gross_salary-pt-pf;
						
						System.out.println("Employee Net Salary Is :- "+net_salary);
		sc.close();
	}

}
