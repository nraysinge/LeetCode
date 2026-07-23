package a.basicsprogram10novto16nov25;

import java.util.Scanner;

public class PrimeNumber {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter The number To check number is prime or not");
			int p=sc.nextInt();
			
			int count=0;
			for(int a=2; a<=p; a++) {
				if(p%a==0)
				count++;
			}
			if(count==2) 
				System.out.println("Number is prime");
			else
				System.out.println("not prime");
			sc.close();
	}
}















//public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
//
//System.out.println("Enter number to Check Number is pirme or not prime");
//int y=sc.nextInt();
//
//int count=0;
//for(int a=1; a<=y; a++) {
//	if(y%a==0) 
//		count++;
//	}
//if(count==2)
//	System.out.println("number is prime");
//else
//	System.out.println("Number is not prime");
//sc.close();
//}
