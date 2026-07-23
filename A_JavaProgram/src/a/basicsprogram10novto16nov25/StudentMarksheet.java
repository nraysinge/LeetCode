package a.basicsprogram10novto16nov25;

import java.util.Scanner;

public class StudentMarksheet {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Mark"); 
		
		int marks=sc.nextInt();
		
		if(marks<=100 && marks>75) {
			System.out.println("A1+ ");
		}
		else if(marks<=75 && marks>65) {
			System.out.println("A1");
		}
		else if(marks<=55 && marks>65) {
			System.out.println("B1");
		}
		else if(marks<=45 && marks>55) {
			System.out.println("c1");
		}
		else if(marks<=35 && marks>45) {
			System.out.println("d1");
		}
		else{
			System.out.println("fail");
		}
		
		sc.close();
		
	}

}
