package d.series.hw_17nov;

import java.util.Scanner;

public class UProOfCubeOfEvenNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Start Number");
		int a = sc.nextInt();

		System.out.println("Enter The Start Number");
		int b = sc.nextInt();

		int cube, pro = 1;
		for (int c = a; c <= b; c++) {
			if (c % 2 == 0) {
				cube = c * c * c;

				pro = cube * cube;

				System.out.println(pro);
			}
		}

		sc.close();
	}

}
