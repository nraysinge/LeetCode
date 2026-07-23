package u.poly.overrideng;

import java.util.Scanner;

public class Circle {

	public double CalculateArea() {
		Scanner sc=new Scanner(System.in);
		System.out.print("\n\nCalculate Area Of Circle then Enter the Redius :- ");
		int a=sc.nextInt();
		double area=3.14*a*a;
		return area;
		
	}
}
