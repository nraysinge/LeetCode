package u.poly.overloding;

public class D1 {

	public void sum(int...b) {
		int sum=0;
		for(int i:b) {
			sum=sum+i;
		}
		System.out.println("sum of integr is:- \n"+sum);
	}
	
	public void sum(double...b) {
		double sum=0;
		for(double i:b) {
		sum=sum+i;
		
		}
		System.out.println("sum of double is:- \n"+sum);
	}
}
