package s.inheritans.qhw_11Dec;

import java.util.Scanner;

public class Bike extends Car{

	private String name, cc, giars; 
	private double price;
	
	private static Bike bikearray[]=new Bike[2];
	
	public Bike() {
	}
	
	public static void acceptBikeArray() {
			for(int i=0; i<bikearray.length; i++) {
			bikearray[i]=new Bike();
			bikearray[i].acceptBikeData();
		}
	}
	public static void showBikeArray() {
		for(int j=0; j<bikearray.length; j++) {
			bikearray[j].showBikeData();
		}	
	}
	
	public Bike(String name, String cc, String giars, double price) {
		super();
		this.name = name;
		this.cc = cc;
		this.giars = giars;
		this.price = price;
	}

	public void showBikeData() {
		showVehicleData();
		System.out.println("\n -: Bike Detials is :- \n");
		System.out.println("Bike Name is:- "+getName());
		System.out.println("Bike CC is:- "+getCc());
		System.out.println("Bike Giars is:- "+getGiars());
		System.out.println("Bike Prise is:- "+getBPrice());
		
	}
	public void acceptBikeData() {
		acceptVehicleData();
		System.out.println("\n -: Enter Bike Detials :- \n");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Bike Name:- ");
		setName(sc.next());
		System.out.print("Enter The Bike CC:- ");
		setCc(sc.next());
		System.out.print("Enter The Bike Giars:- ");
		setGiars(sc.next());
		System.out.print("Enter The Bike Price:- ");
		setBPrice(sc.nextDouble());
		System.out.println("\n -: Enter next Bike Detials :- \n");
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getGiars() {
		return giars;
	}
	public void setGiars(String giars) {
		this.giars = giars;
	}
	public double getBPrice() {
		return price;
	}
	public void setBPrice(double price) {
		this.price = price;
	}
}
