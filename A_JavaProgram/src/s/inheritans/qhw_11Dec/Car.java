package s.inheritans.qhw_11Dec;

import java.util.Scanner;

public class Car extends Vehicle{

	private String car_name, car_module_num, fule_type;
	private int price;
	private static Car cararray[]=new Car[3];	
	public Car() {
		
	}
	public Car(String car_name, String car_model_num, String fule_type, int price) {
		this.car_name = car_name;
		this.car_module_num = car_model_num;
		this.fule_type = fule_type;
		this.price = price;
	}
	public static void ShowCarArray() {
		for(int i=0; i<cararray.length; i++) {
			cararray[i].showData();
		}
//		for(Car c:cararray) {
//			c.showData();
//		}
	}
	public static void AcccptCarArray() {
		for(int i=0; i<cararray.length; i++) {
				cararray[i]=new Car();
				cararray[i].acceptData();
		}
	}
	public void showData() {
		showVehicleData();
		System.out.println("Car name is:- "+getCar_name());
		System.out.println("Car Model_Num is:- "+getCar_model_num());
		System.out.println("Car Fule_Type is:- "+getFule_type());
		System.out.println("Car prise is:- "+getPrice());
		System.out.println("\n -: Car Ditials is:- ");
		
	}
	public void acceptData(){
		acceptVehicleData();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Car_name:- ");
		setCar_name(sc.next());
		System.out.print("Enter Car_Model_Num:- ");
		setCar_model_num(sc.next());
		System.out.print("Enter car_Fule_Type:- ");
		setFule_type(sc.next());
		System.out.print("Enter Car_price:- ");
		setPrice(sc.nextInt());
		System.out.println("\n -: Enter Next Car Data :- ");
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getCar_model_num() {
		return car_module_num;
	}
	public void setCar_model_num(String car_model_num) {
		this.car_module_num = car_model_num;
	}
	public String getFule_type() {
		return fule_type;
	}
	public void setFule_type(String fule_type) {
		this.fule_type = fule_type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	


}
