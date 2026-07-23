package h.returntype.que_21Nov;

import java.util.Scanner;

public class value_return {

	public long total(int a, int b) {
		long c = a + b;
		return c;
	}
	public int subtraction(int a, int b) {
		int c = a - b;
		return c;
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public double division() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The firt number to division");
		int a=sc.nextInt();
		System.out.println("Enter The Second Number division");
		int b=sc.nextInt();
		int c=a%b;
		sc.close();
		return c;
		
	}
	

}
