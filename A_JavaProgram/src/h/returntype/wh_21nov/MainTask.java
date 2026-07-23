package h.returntype.wh_21nov;

public class MainTask {

	public static void main(String[] args) {
		
		Task_1 t1=new Task_1();
		
		t1.sum(10, 20);
		double p=t1.productEvenDigi();
		System.out.println("Product of given number is "+p);
		
		
		float f=Task_1.factorialNum(7);
		System.out.println("Factorial num is "+f);
	}
}
