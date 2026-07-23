package d.series.hw_17nov;

import java.util.Scanner;

public class VProOFDigitOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The digit to you want product");
		int num = sc.nextInt();
		int prod = 1;
		while (num > 0) {
			int d = num % 10;
			prod = prod * d;
			num = num / 10;
		}
		System.out.print(prod + " ");
		sc.close();
	}
}
