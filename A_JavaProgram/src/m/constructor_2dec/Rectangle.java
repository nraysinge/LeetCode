package m.constructor_2dec;

public class Rectangle {
	double length, width, sum;
	public Rectangle(double l, double w) {
		length=l;
		width=w;
		sum=w*l;
	}
	public void ShowData() {
		System.out.println("lenth is:- "+length);
		System.out.println("width is:- "+width);
		System.out.println("width is:- "+sum);
	}
}
