package p.array.foreachloop;

import java.util.Scanner;

public class ForEachLoop {

	public static void main(String[] args) {
		int y[] = new int[5];
		ForEachLoop e = new ForEachLoop();
		e.acceptData(y);
		e.showArray_2(y);
	}

	public void showArray_2(int y[]) {
//		Scanner sc=new Scanner(System.in);
		System.out.print("Valuve of array :- ");
		for (int i : y) {
			System.out.print(i+" ");
		}
	}

	public void showArray(int y[]) {
		System.out.println("array valuve:- ");
		for (int k = 0; k < y.length; k++) {

		}
	}

	public void acceptData(int y[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		for (int j = 0; j < y.length; j++) {
			y[j] = sc.nextInt();
		}
	}
}
