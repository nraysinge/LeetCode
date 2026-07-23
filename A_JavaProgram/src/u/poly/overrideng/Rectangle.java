package u.poly.overrideng;

import java.util.Scanner;

public class Rectangle {

	public double CalculateArea() {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nCalculate Area Of Rectangle then Enter Rectangle Lenth:- ");
		float l=sc.nextFloat();
		System.out.print("Calculate Area Of Rectangle then Enter Rectangle Widht:- ");
		float w=sc.nextFloat();
		double area=l*w;
		return area;
	}
}
