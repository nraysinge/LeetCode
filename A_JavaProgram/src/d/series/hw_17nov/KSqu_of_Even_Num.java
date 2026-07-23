package d.series.hw_17nov;

import java.util.Scanner;

public class KSqu_of_Even_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Start number");
		int a = sc.nextInt();

		System.out.println("Enter The End Number");
		int b = sc.nextInt();

		int squ = 1;
		for (int c = a; c <= b; c++) {

			if (c % 2 == 0) {
				squ = c * c;
				System.out.print(squ + " ");
			}

			sc.close();
		}
	}
}
