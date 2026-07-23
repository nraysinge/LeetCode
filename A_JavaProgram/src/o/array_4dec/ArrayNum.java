package o.array_4dec;

import java.util.Scanner;

public class ArrayNum {

	public static void main(String[] args) {
		int y[] = new int[4];
		ArrayNum e = new ArrayNum();
		e.acceptArray(y);
		e.even(y);
		// e.Square(y);
		// e.rev(y);
		// int d=e.sum(y);
		// System.out.println("fdfd "+d);
		// int s=e.prod(y);
		// System.out.println("dfd "+s);
	}

	public void acceptArray(int l[]) {
		int len = l.length;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value:- ");
		for (int k = 0; k < len; k++) {
			l[k] = sc.nextInt();
		}
	}

	public void even(int e[]) {
		for (int k = 0; k < e.length; k++) {
			if (e[k] % 2 == 0)
				System.out.print("even num :- " + e[k] + " ");
		}
	}

	public void square(int s[]) {
		System.out.println("Enter the value:- ");
		for (int k = 0; k < s.length; k++) {
			int square = s[k] * s[k];
			System.out.println("sqyare of :- " + square);
		}
	}

	public void rev(int a[]) {
		int len = a.length;
		for (int i = len - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

	public int sum(int a[]) {
		int b = 0;
		int len = a.length;
		for (int i = 0; i < len; i++) {
			b = b + a[i];
		}
		return b;
	}

	public int prod(int a[]) {
		int c = 1;
		int len = a.length;
		for (int i = 0; i < len; i++) {
			c = c * a[i];
		}
		return c;
	}

}
