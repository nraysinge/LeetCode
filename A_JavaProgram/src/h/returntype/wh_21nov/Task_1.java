package h.returntype.wh_21nov;

import java.util.Scanner;

public class Task_1 {
	
	public void sum(int a, int b) {
		int add=a+b;
		System.out.println("Sum is:- "+add);
	}
	
	public double productEvenDigi() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Start Num to find even num");
		int e1=sc.nextInt();
		
		System.out.println("Enter The End Num");
		int e2=sc.nextInt();
		
		int pro=1;
		for(int a=e1; a<=e2; a++) {
			
			if(a%2==0)
				pro=pro*a;
				sc.close();
		}
		return pro;
	}
	
	public static float factorialNum(int a) {
		
		int f=1;
		for(int b=1; b<=a; b++){
			f=f*b;
	}
	return f;
	}
	
}
