package e.num.pattern.que_18nov;

import java.util.Scanner;

public class P2NnumberOfDdigitCount {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number To count");
		int y=sc.nextInt();
		int count=0;
		while(y>0) {
			count++;
			y=y/10;
		}
		System.out.println("digit is :- "+count);	
		sc.close();
	}
}
