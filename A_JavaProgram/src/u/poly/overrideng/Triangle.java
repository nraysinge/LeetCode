package u.poly.overrideng;

import java.util.Scanner;

public class Triangle {

	public double calculateArea() {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nCalculate Area of Triangle then Enter hight of Triangle:- ");
		double t=sc.nextDouble();
		System.out.print("Calculate Area of Triangle then Enter base of Triangle:- ");
		double t2=sc.nextDouble();
		double area=(t*t2)/2;
		return area;
	}
}
