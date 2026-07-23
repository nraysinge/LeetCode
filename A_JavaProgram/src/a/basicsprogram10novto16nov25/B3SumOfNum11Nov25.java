package a.basicsprogram10novto16nov25;

import java.util.Scanner;

public class B3SumOfNum11Nov25 {
	public static void main(String []args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Five Number");
		int n1,n2,n3,n4,n5;
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		n4=sc.nextInt();
		n5=sc.nextInt();
		int total =n1+n2+n3+n4+n5;
		System.out.println("given numbers total is :- "+total);
		sc.close();
	
	}

}
