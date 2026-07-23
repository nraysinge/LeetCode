package d.series.hw_17nov;

import java.util.Scanner;

public class NSqu_Of_Odd_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Start Number");
		int a = sc.nextInt();

		System.out.println("Enter The Start Number");
		int b = sc.nextInt();

		int squ, sum = 0;
		for (int c = a; c <= b; c++) {
			if (c % 2 != 0) {
				squ = c * c;
				sum = sum + squ;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
