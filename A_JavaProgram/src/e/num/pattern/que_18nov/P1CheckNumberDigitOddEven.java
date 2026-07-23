package e.num.pattern.que_18nov;

import java.util.Scanner;

public class P1CheckNumberDigitOddEven {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int d,a;
		System.out.println("enter the number");
		d=sc.nextInt();
		
		while(d>0) {
			
			a=d%10;
			if(a%2!=0) {
				System.out.println("the odd number is:- "+a);
			}
			d=d/10;
		}
		sc.close();		
	}

}
