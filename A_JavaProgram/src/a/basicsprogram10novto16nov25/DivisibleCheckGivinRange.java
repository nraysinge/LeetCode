package a.basicsprogram10novto16nov25;

import java.util.Scanner;

public class DivisibleCheckGivinRange {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n,start;
		
		System.out.println("Enter the number to divide you :- ");
		n=sc.nextInt();
		
		System.out.println("Enter the start range to "+n+" givin number you");
		start=sc.nextInt();
		
		System.out.println("Enter the start range to "+n+" givin number you");
		int end=sc.nextInt();
		
		int a;
		for(a=start; a<=end; a++) {
				if(a%n==0) {
					System.out.print("The Givin "+n+ " is divided by "+start+" to "+end+ " range is ");
					
					System.out.println(a);
			}
				sc.close();		
		}
		

	}
		
	}

