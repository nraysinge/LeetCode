package h.returntype.wh_21nov;

import java.util.Scanner;

public class MainOperation {
	
		public int addition() {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter The Firt Number To Addition");
			int a=sc.nextInt();
			
			System.out.println("Enter The Second Number To Addition");
			int b=sc.nextInt();
			
			int c=a+b;
			sc.close();
			return c;
	}
		public int subtraction() {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter The Firt Number To subtraction");
			int a=sc.nextInt();
			
			System.out.println("Enter The Second Number To subtraction");
			int b=sc.nextInt();
			
			int c=a-b;
			sc.close();
			return c;
		
	}
		public int multiplication() {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter The Firt Number To multiplication");
			int a=sc.nextInt();
			
			System.out.println("Enter The Second Number To multiplication");
			int b=sc.nextInt();
			
			int c=a*b;
			sc.close();
			return c;
		
	}
		public int division() {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter The Firt Number To division");
			int a=sc.nextInt();
			
			System.out.println("Enter The Second Number To division");
			int b=sc.nextInt();
			
			int c=a/b;
			sc.close();
			return c;
			
		}
		public int modulo() {
			Scanner sc=new Scanner(System.in);
				
			System.out.println("Enter The Firt Number To modulo");
			int a=sc.nextInt();
				
			System.out.println("Enter The Second Number To modulo");
			int b=sc.nextInt();
				
			int c=a%b;
			sc.close();
			return c;
			}		
}