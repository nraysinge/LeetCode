package e.num.pattern.que_18nov;

import java.util.Scanner;

public class P6FactotrialOfNumberPrint {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Number for factorial ");
		int y=sc.nextInt();
		int f=1;
		for(int a=1; a<=y; a++){
			f=f*a;
		}
		System.out.println(f);
		sc.close();
	}
}
