package q.array.practical.hw_8Dec;

import java.util.Scanner;

public class Array1 {
	
	public static void main(String[] args) {
		Array1 a=new Array1();
		a.acceptValuve();
		a.swapValuve();
	}
	int first, second, third;
	public void acceptValuve() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first value:- ");
		first=sc.nextInt();
		System.out.print("Enter the second value:- ");
		second=sc.nextInt();
	}
	
	public void swapValuve() {
		third=first;
		first=second;
		first=third;
		System.out.println();
		System.out.println("After Swaping:- "+first);
		System.out.println("After Swaping:-  "+second);
	}
}
