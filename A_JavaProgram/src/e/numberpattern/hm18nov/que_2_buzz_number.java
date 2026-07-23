package e.numberpattern.hm18nov;

import java.util.Scanner;

public class que_2_buzz_number {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the number to check is buzz number");
			int b=sc.nextInt();
					
			if(b%10==7 && b%7==0) {
				System.out.println("number is buzz");
			} else {
				System.out.println("Number is not buzz");
			}
			sc.close();
	}
}
