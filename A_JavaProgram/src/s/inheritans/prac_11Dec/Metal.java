package s.inheritans.prac_11Dec;

import java.util.Scanner;

public class Metal {

	private String name, color;
	private double boiling_point, melting_point;
	
	
	public Metal() {
		setName("na");
		setColor("df");
		setBoilingPoint(2525);
		setMeltingPoint(2563);
	}
	public Metal(String n, String c, double b, double m) {
		setName(n);
		setColor(c);
		setBoilingPoint(b);
		setMeltingPoint(m);
	}
	public void acceptMData() {
		System.out.println(" -:Enter propertis:- ");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name of metel:- ");
		setName(sc.next());
		System.out.print("Enter the color of metel:- ");
		setColor(sc.next());
		System.out.print("Enter the Boiling Point of metel:- ");
		setBoilingPoint(sc.nextDouble());
		System.out.print("Enter the Metaling point of metel:- ");
		setMeltingPoint(sc.nextDouble());
	}
	public void showMData() {
		System.out.println("\n -: Metal Propertis :-");
		System.out.println();
		System.out.println("Name of Metal:- "+getName());
		System.out.println("color of Metal:- "+getColor());
		System.out.println("Boiling Point of Metal:- "+getBoilinPoint());
		System.out.println("Metaling point:- "+getMeltingPoint());
	}
	
	public void setName(String n) {
		name=n;
	}
	public void setColor(String c) {
		color=c;
	}
	public void setBoilingPoint(double b) {
		boiling_point=b;
	}
	public void setMeltingPoint(double m) {
		boiling_point=m;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public double getBoilinPoint() {
		return boiling_point;
	}
	public double getMeltingPoint() {
		return melting_point;
	}
	
	
}
