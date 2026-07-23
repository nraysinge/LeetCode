package s.inheritans.qhw_11Dec;

import java.util.Scanner;

public class Vehicle {

	private String color, company_name, vehicle_type;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String color, String company_name, String vehicle_type) {
		this.color = color;
		this.company_name = company_name;
		this.vehicle_type = vehicle_type;
	}
	public void showVehicleData() {
		System.out.println("Vehicle Type is:- "+getVehicle_type());
		System.out.println("Vehicle Company Name is:- "+getCompany_name());
		System.out.println("Vehicle Color is:- "+getColor());
		
	}
	public void acceptVehicleData(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Vehicle_type:- ");
		setVehicle_type(sc.next());
		System.out.print("Enter Company_Name:- ");
		setCompany_name(sc.next());
		System.out.print("Enter Vehicle_color:- ");
		setColor(sc.next());
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getVehicle_type() {
		return vehicle_type;
	}

	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}

}
