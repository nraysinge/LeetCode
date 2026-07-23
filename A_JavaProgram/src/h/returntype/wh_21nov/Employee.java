package h.returntype.wh_21nov;

import java.util.Scanner;

public class Employee {
	
	String n,c,p;
	float a,s;

	//float m=s;
	float da,hra,tra,pf,pt;
	
	public void properties(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Employee Name :- ");
		n=sc.nextLine();
		
		System.out.println("Enter The Employee Age :- ");
		a=sc.nextFloat();
		
		System.out.println("Enter The Employee Basic Salary :- ");
		s=sc.nextFloat();
		
		System.out.println("Enter The Employee Address :- ");
		c=sc.next();
		
		System.out.println("Enter The Employee Post :- ");
		p=sc.next();
		
		sc.close();
	}
	
	public void showEmpData() {
		System.out.println("Employee Name :- "+n);
		System.out.println("Employee Age :- "+a);
		System.out.println("Employee Salary :- "+s);
		System.out.println("Employee Address :- "+c);
		System.out.println("Employee Post :- "+p);
	}
	
	public void calculateDa() {
		Scanner sc=new Scanner(System.in);
		da=(s*5)/100;
		hra=(s*10)/100;
		tra=(s*15)/100;
		sc.close();
	}
	
	public void calculatePfPt() {
		Scanner sc=new Scanner(System.in);
		pt=(s*10)/100;
		pf=(s*12)/100;
		sc.close();
	}
	
	public void grossSalary() {
		System.out.println("da is :- "+(da+s));
		System.out.println("hra is :- "+(hra+s));
		System.out.println("tra is :- "+(tra+s));
	}
	public void netSalary() {
		System.out.println("pt is :- "+(pt-s));
		System.out.println("pf is :- "+(pf-s));
		System.out.println("Employee GrossSalary is :- "+(s+da+hra+tra));
		System.out.println("Employee NetSalary is :- "+(s+pt+pf));
		}

//	
//	public float basicSalary() {
//		Scanner sc=new Scanner(System.in);
////		System.out.println("Enter The Employee Salary :- ");
////		float s=sc.nextFloat();
////		sc.close();
////		return s;
//	}
//	
//	public String city() {
////		Scanner sc=new Scanner(System.in);
////		System.out.println("Enter The Employee Address :- ");
////		String c=sc.next();
////		sc.close();
////		return c;
//	}
//	
//	public String post() {
////		Scanner sc=new Scanner(System.in);
////		System.out.println("Enter The Employee Post :- ");
////		String p=sc.next();
////		sc.close();
//		return p;
//	}
//	
//	public float grossSalary() {
//		Scanner sc=new Scanner(System.in);
//		float a=basicSalary();
//		float da,hra,tra;
//		da=(a*100)%5;
//		hra=(a*100)%10;
//		tra=(a*100)%15;
//		//System.out.println("Enter The Employee Age :- ");
//		float gs=a+da+hra+tra;
//		//System.out.println("Employee GrossSalary is :- "+gs);
//		sc.close();
//		return gs;
//	}
//	

}
