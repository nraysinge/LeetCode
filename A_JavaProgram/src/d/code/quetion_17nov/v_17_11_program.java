package d.code.quetion_17nov;

import java.util.Scanner;

public class v_17_11_program {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The number : ");
		
		int y=sc.nextInt();
		
		int n=0, sum=0;
		
		while(y>0) {
			
			n=y%10;
			
			sum+=n;
			
			y=y/10;
			
			sc.close();
		}	
		System.out.println("Entered sum of numbers is :- "+sum);	
	}
}
