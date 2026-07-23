package e.num.pattern.que_18nov;

import java.util.Scanner;

public class P5PrimeNumberPrint {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number to Check Number is pirme or not prime");
		int y=sc.nextInt();
		
		int count=0;
		for(int a=1; a<=y; a++) {
			if(y%a==0) 
				count++;
			}
		if(count==2)
			System.out.println("number is prime");
		else
			System.out.println("Number is not prime");
	sc.close();
		}
	}


