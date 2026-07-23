package d.series.hw_17nov;

import java.util.Scanner;

public class OSum_of_Cube_of_odd_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Start Number");
		int a = sc.nextInt();

		System.out.println("Enter The Start Number");
		int b = sc.nextInt();

		int cube, sum = 0;
		for (int c = a; c <= b; c++) {
			if (c % 2 != 0) {
				cube = c * c * c;
				sum = sum + cube;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
