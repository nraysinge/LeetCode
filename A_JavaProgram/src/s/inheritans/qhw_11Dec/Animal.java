package s.inheritans.qhw_11Dec;

import java.util.Scanner;

public class Animal {
	
	private String name, color, food_type;	
	
	public Animal() {
		setName("na");
		setColor("df");
		setFoodType("sfdf");
	}
	public Animal(String n, String c, String b) {
		setName(n);
		setColor(c);
		setFoodType(b);
		
	}
	public void acceptAnimalData() {
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter animal Name :- ");
		setName(sc.next());
		System.out.print("Enter animal color:- ");
		setColor(sc.next());
		System.out.print("Enter animal food type:- ");
		setFoodType(sc.next());
		
	}
	public void showAnimalData() {
		System.out.println();
		System.out.println("Name of Animal:- "+getName());
		System.out.println("color of Animal:- "+getColor());
		System.out.println("Food Type of Animal:- "+getFoodType());
	
	}
	
	public void setName(String n) {
		name=n;
	}
	public void setColor(String c) {
		color=c;
	}
	public void setFoodType(String b) {
		food_type=b;
	}
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public String getFoodType() {
		return food_type;
	}
	
}
