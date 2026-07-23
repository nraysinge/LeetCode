package a.basicsprogram10novto16nov25;

import java.util.Scanner;

public class B2DivisibleBy3_5_11nov25 {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the valuve");
		int a=sc.nextInt();
		if(a%3==00 && a%5==0)
			System.out.println(a+" Number Is Divisible 3 and 5");
		else
			System.out.println(a+" Number Is Not Divisible 3 and 5");
		sc.close();
				
			}
	
}
