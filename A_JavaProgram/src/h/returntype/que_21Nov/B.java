package h.returntype.que_21Nov;

public class B {

	public int sum() {
		int b=0;
		for(int a=1; a<=10; a++) {
		b=b+a;
		}
		return b;
	}
	
	public int fact(int b) {
		int f=1;
		for (int a=1; a<=b; a++) {
			f=f*b;
		}
		return f;
	}
	
	public double multiplication() {
	double a=22, b=55, pro=1;
	for(double c=a; c<=b; c++) {
		if(c%2==0) {
			double cube=c*c*c;
			pro=cube*cube;
			}
		}
		return pro;
	}
	
	public int power(int power) {
		int base=4;
		int result=1;
		for(int a=1; a<=power; a++) {
		result=result*base;
		}
		return result;
	}
}

