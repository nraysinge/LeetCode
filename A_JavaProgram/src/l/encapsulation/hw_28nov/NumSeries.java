package l.encapsulation.hw_28nov;

import java.util.Scanner;

public class NumSeries {
	public static void main(String[] args) {
		NumSeries n=new NumSeries();
//		n.number();
//		n.digit();
		n.numSeris2();
	}

	Scanner sc = new Scanner(System.in);
	private int y = sc.nextInt();
	int reverseNumber;

	public int number() {
		int reverse = 0;
		int num = y;
		int n = 0;
		while (y > 0) {
			n = y % 10;
			reverse = (reverse * 10) + n;
			y = y / 10;
		}
		System.out.println(reverse);
		reverseNumber = reverse;
		return reverse;
	}

	public void digit() {
		while (reverseNumber > 10) {
			int digit = reverseNumber % 10;
			for (int i = 1; i <= digit; i++) {
				System.out.println("digit");
			}
				System.out.println();
				reverseNumber = reverseNumber / 10;
		}
	}
	public void numSeris2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number :- ");
		long number=sc.nextLong();
		String numberStr=Long.toString(number);
			for(int i=0; i<numberStr.length(); i++) {
			char digitChar=numberStr.charAt(i);
			int digit = Character.getNumericValue(digitChar);
			
			switch (digit) {
			case 1:
				System.out.print("One ");
				break;
			case 2:
				System.out.print("Two ");
				break;
			case 3:
				System.out.print("Three ");
				break;
			case 4:
				System.out.print("Four ");
				break;
			case 5:
				System.out.print("Five ");
				break;
			case 6:
				System.out.print("Six ");
				break;
			case 7:
				System.out.print("Seven ");
				break;
			case 8:
				System.out.print("Eight ");
				break;
			case 9:
				System.out.print("Nine ");
				break;
			case 0:
				System.out.print("Zero ");
				break;
			default: System.out.println("Number out of range");
				break;
			}
		}
	}
}
