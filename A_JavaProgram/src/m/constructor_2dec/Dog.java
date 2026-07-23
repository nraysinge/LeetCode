package m.constructor_2dec;

public class Dog {
	String name, color;
	
	public Dog(String n, String c) {
		name=n;
		color=c;
		
	}
	
	public void showData() {
		
		System.out.println("Name:- "+name);
		System.out.println("Color:- "+color);
	}
}
