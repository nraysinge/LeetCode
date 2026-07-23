package e.num.pattern.que_18nov;

import java.util.Scanner;

public class P7PowerOfNoumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number To check powar of number:- ");
		int base=sc.nextInt();
		
		System.out.println("Enter The Number To check powar of number:- ");
		int power=sc.nextInt();
		
		// int base=4, power=5;
		int result=1;
		
		for(int a=1; a<=power; a++) {
			
			result=result*base;
		}
		System.out.println(result);
		sc.close();
	}
}
