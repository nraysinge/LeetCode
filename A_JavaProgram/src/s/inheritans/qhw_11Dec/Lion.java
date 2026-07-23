package s.inheritans.qhw_11Dec;

import java.util.Scanner;

public class Lion extends Tiger{

private String type, height, Weight;	
	
	public Lion() {
		setType("na");
		setHeight("df");
		setWeight("sfdf");
	}
	public Lion(String n, String c, String b) {
		setType(n);
		setHeight(c);
		setWeight(b);
		
	}
	public void acceptLion() {
		acceptAnimalData();
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter Lion type :- ");
		setType(sc.next());
		System.out.print("Enter Lion Height:- ");
		setHeight(sc.next());
		System.out.print("Enter Lion Weight:- ");
		setWeight(sc.next());
		
	}
	public void showLion() {
		showAnimalData();
		System.out.println();
		System.out.println("Tiger type is:- "+getType());
		System.out.println("Lion height is:- "+getHeight());
		System.out.println("Lion weight is:- "+getWeight());
	
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
