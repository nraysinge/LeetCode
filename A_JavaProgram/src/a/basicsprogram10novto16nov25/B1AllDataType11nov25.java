package a.basicsprogram10novto16nov25;

import java.util.Scanner;

public class B1AllDataType11nov25 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		byte b1 = sc.nextByte();
		System.out.println("Byte -: " + b1);
		
		System.out.println("Enter The Number");
		Short s1 = sc.nextShort();
		System.out.println("Short -: " + s1);
		
		System.out.println("Enter The Number");
		int i1 = sc.nextInt();
		System.out.println("Int -: " + i1);
		
		System.out.println("Enter The Number");
		long l1 = sc.nextLong();
		System.out.println("Long -: " + l1);
		
		System.out.println("Enter The Number");
		float f1 = sc.nextFloat();
		System.out.println("Flot -: " + f1);
		
		System.out.println("Enter The Number");
		double d1 = sc.nextDouble();
		System.out.println("Double -: " + d1);
		
		System.out.println("enter the value");
		boolean bb1 = sc.nextBoolean();
		System.out.println("Boolean -: " + bb1);
		sc.close();
	}
}
