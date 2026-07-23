package h.returntype.que_21Nov;

public class DemoB {
	public static void main(String[] args) {
		B b1=new B();
		
		int s=b1.sum();
		System.out.println("Sum is :- "+s);
	
		int g=b1.fact(10);
		System.out.println("Factorial Number is:- "+g);
		
		double j=b1.multiplication();
		System.out.println("Product is :- "+j);
		
		int r=b1.power(6);
		System.out.println("Pawor of "+r+" is :- "+r);
	}

}
