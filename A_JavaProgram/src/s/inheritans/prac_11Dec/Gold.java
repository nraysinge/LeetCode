package s.inheritans.prac_11Dec;

import java.util.Scanner;

public class Gold extends Iron {

	private String carret,use_gold;
	private double price, boiling_point, melting_point;	
	
	public Gold() {
		setCarret("na");
		setUseGold("Na");
		setPrice(5255);
		setBoilingPoint(2525);
		setMeltingPoint(2563);
	}
	public Gold(String n, String c, double b, double m, double u) {
		setCarret(n);
		setUseGold(c);
		setPrice(b);
		setBoilingPoint(b);
		setMeltingPoint(m);
	}
	public void acceptGData() {
		System.out.println("\n -: enter gold data :-");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the carret of gold:- ");
		setCarret(sc.next());
		System.out.print("Enter the use of gold:- ");
		setUseGold(sc.next());
		System.out.print("Enter the Price of gold:- ");
		setPrice(sc.nextDouble());
		System.out.print("Enter the Boiling Point of gold:- ");
		setBoilingPoint(sc.nextDouble());
		System.out.print("Enter the Metaling point of gold:- ");
		setMeltingPoint(sc.nextDouble());
	}
	public void showGData() {
		System.out.println("\n -: gold propertis :-");
		System.out.println();
		System.out.println("Gold Carret:- "+getCarret());
		System.out.println("use of gold:- "+getUseGold());
		System.out.println("Price of gold:- "+getPrice());
		System.out.println("Boiling Point of gold:- "+getBoilinPoint());
		System.out.println("Metaling point gold:- "+getMeltingPoint());
	}
	
	public void setCarret(String n) {
		carret=n;
	}
	public void setUseGold(String c) {
		use_gold=c;
	}
	public void setPrice(double c) {
		price=c;
	}
	public void setBoilingPoint(double b) {
		boiling_point=b;
	}
	public void setMeltingPoint(double m) {
		boiling_point=m;
	}
	public String getCarret() {
		return carret;
	}
	public String getUseGold() {
		return use_gold;
	}
	public double getPrice() {
		return price;
	}
	public double getBoilinPoint() {
		return boiling_point;
	}
	public double getMeltingPoint() {
		return melting_point;
	}

}
