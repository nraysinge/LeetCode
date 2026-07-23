package s.inheritans.qhw_11Dec;

import java.util.Scanner;

public class Tiger extends Animal{
	
private String type, height, Weight;	
	
	public Tiger() {
		setType("na");
		setHeight("df");
		setWeight("sfdf");
	}
	public Tiger(String n, String c, String b) {
		setType(n);
		setHeight(c);
		setWeight(b);
		
	}
	public void acceptTiger() {
		acceptAnimalData();
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter Tiger type :- ");
		setType(sc.next());
		System.out.print("Enter Tiger Height:- ");
		setHeight(sc.next());
		System.out.print("Enter Tiger Weight:- ");
		setWeight(sc.next());
		
	}
	public void showTiger() {
		showAnimalData();
		System.out.println();
		System.out.println("Tiger type is:- "+getType());
		System.out.println("Tiger height is:- "+getHeight());
		System.out.println("Tiger weight is:- "+getWeight());
	
	}
	
	public void setType(String n) {
		type=n;
	}
	public void setHeight(String c) {
		height=c;
	}
	public void setWeight(String b) {
		Weight=b;
	}
	
	public String getType() {
		return type;
	}
	public String getHeight() {
		return height;
	}
	public String getWeight() {
		return Weight;
	}
	
}
