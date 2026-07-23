package a.basicsprogram10novto16nov25;

import java.util.Scanner;

public class B1OddEvenNumCheck11Nov25 {
	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number");
		int a=sc.nextInt();
				
				if(a%2==0)
					System.out.println("This Number Is Even");
				
				else
					System.out.print("This Number is Odd");
				
				sc.close();
					
		
	}

}
