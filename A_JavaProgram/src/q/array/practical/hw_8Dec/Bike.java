package q.array.practical.hw_8Dec;

import java.util.Scanner;

public class Bike {
	
	private String company, name, cc, giars; 
	private double price;
	
	private static Bike bikearray[]=new Bike[3];
	
	public Bike() {
		setCompany("bajaj");
		setName("pulser");
		setCC("250 CC");
		setGiars("5 Giars");
		setPrice(170000);
	}
	
	public Bike(String c, String n, String cc, String g, double p) {
		setCompany(c);
		setName(n);
		setCC(cc);
		setGiars(g);
		setPrice(p);
		showData();
	}
	public static void bikeSortPrise() {
		for(int i=0; i<bikearray.length; i++) {
			for(int j=i; j<bikearray.length; j++) {
				if(bikearray[i].getPrice()<bikearray[j].getPrice()) {
					Bike b1=bikearray[i];
					bikearray[i]=bikearray[j];
					bikearray[j]=b1;
				}
			}
		}
	}
	
	public static void bikeAcceptArray() {
		for(int i=0; i<bikearray.length; i++) {
			bikearray[i]=new Bike();
			bikearray[i].acceptBikeData();
		}
	}
	
	public static void bikeShowArray() {
		for(int j=0; j<bikearray.length; j++) {
			bikearray[j].showData();
		}
	}
	
	public void acceptBikeData() {
		System.out.println();
		System.out.println(" -: Enter new Bike Ditails :- ");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Company Name:- ");
		setCompany(sc.next());
		System.out.print("Enter Bike Name:- ");
		setName(sc.next());
		System.out.print("Enter Bike CC:- ");
		setCC(sc.next());
		System.out.print("Enter Bike Giars:- ");
		setGiars(sc.next());
		System.out.print("Enter Bike Price:- ");
		setPrice(sc.nextDouble());
	}
	public void showData() {
		System.out.println();
		System.out.println("-: Bike Detials :- ");
		System.out.println();
		System.out.println("Company Name:- "+getCompany());
		System.out.println("Bike Name:- "+getName());
		System.out.println("Bike CC:- "+getCC());
		System.out.println("Bike Giars:- "+getGiars());
		System.out.println("Bike Price is:- "+getPrice());
	}
	
	public void setCompany(String i) {
		company = i;
	}

	public void setName(String n) {
		name = n;
	}

	public void setCC(String s) {
		cc = s;
	}

	public void setGiars(String a) {
		giars = a;
	}

	public void setPrice(double p) {
		price = p;
	}

	public String getCompany() {
		return company;
	}

	public String getName() {
		return name;
	}

	public String getCC() {
		return cc;
	}

	public String getGiars() {
		return giars;
	}

	public double getPrice() {
		return price;
	}
}
