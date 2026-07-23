package k.encapsulation_27nov;

import java.util.Scanner;

public class Netflix {
	private String name;
	private double subcription;
	
	public void setName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.next();
		sc.close();
	}
	
	public void setSubcription(double s) {
		subcription=s;
	}

	public String getName() {
		return name;
	}
	
	public double getSubcription() {
		return subcription;
		
	}
}
