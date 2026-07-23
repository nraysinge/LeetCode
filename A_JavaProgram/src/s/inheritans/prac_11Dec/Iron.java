package s.inheritans.prac_11Dec;

import java.util.Scanner;

public class Iron extends Metal {
	

	private String gio_location, color;
	private double boiling_point, melting_point;	
	
	public Iron() {
		setGioLocation("na");
		setColor("df");
		setBoilingPoint(2525);
		setMeltingPoint(2563);
	}
	public Iron(String n, String c, double b, double m) {
		setGioLocation(n);
		setColor(c);
		setBoilingPoint(b);
		setMeltingPoint(m);
	}
	public void acceptIData() {
				acceptMData();
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter GioLocation of Iron:- ");
		setGioLocation(sc.next());
		System.out.print("Enter the color of Iron:- ");
		setColor(sc.next());
		System.out.print("Enter the Boiling Point of Iron:- ");
		setBoilingPoint(sc.nextDouble());
		System.out.print("Enter the Metaling point of Iron:- ");
		setMeltingPoint(sc.nextDouble());
	}
	public void showIData() {
		showMData();
		System.out.println("\n- : Iron Propertis :-");
		System.out.println();
		System.out.println("Name of GioLocation:- "+getGioLocation());
		System.out.println("color of Iron:- "+getColor());
		System.out.println("Boiling Point of Iron:- "+getBoilinPoint());
		System.out.println("Metaling point:- "+getMeltingPoint());
	}
	
	public void setGioLocation(String n) {
		gio_location=n;
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
	public String getGioLocation() {
		return gio_location;
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
