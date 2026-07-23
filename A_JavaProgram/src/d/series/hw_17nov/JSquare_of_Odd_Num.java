package d.series.hw_17nov;

import java.util.Scanner;

public class JSquare_of_Odd_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();

		int squ = 1;
		for (int c = a; c <= b; c++) {
			if (c % 2 != 0) {
				squ = c * c;
				System.out.print(" " + squ);
			}
			sc.close();
		}
	}
}
