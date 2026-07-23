package d.series.hw_17nov;

import java.util.Scanner;

public class MCube_of_Even_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the start number");
		int a = sc.nextInt();

		System.out.println("Enter The end number");
		int b = sc.nextInt();

		int cube;
		for (int c = a; c <= b; c++) {
			if (c % 2 == 0) {
				cube = c * c * c;
				System.out.print(cube + " ");
			}
			sc.close();
		}

	}
}