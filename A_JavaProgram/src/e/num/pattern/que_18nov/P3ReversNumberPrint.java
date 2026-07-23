package e.num.pattern.que_18nov;

import java.util.Scanner;

public class P3ReversNumberPrint {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter The Number To revers :- ");
		int y=sc.nextInt();
		int n=0,rev=0;
		while (y>0) {
			n=y%10;
			rev=(rev*10)+n;
			y=y/10;		
		}
	System.out.print("revers:- " + rev);
	sc.close();
	}
}
