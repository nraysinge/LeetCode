package n.array_hw_3dec;

import java.util.Scanner;

public class NetflixArray {
	public static void main(String[] args) {
		NetflixArray n2 = new NetflixArray();
		n2.showData();

		NetflixArray n1 = new NetflixArray("dffdfd", 552.1);
		n1.showData();

		NetflixArray n = new NetflixArray();
		n.acceptData();
		n.showData();
	}

	private String name;
	private double subscription;

	public NetflixArray() {
		setName("na");
		setSubscription(0.0);

	}

	public NetflixArray(String n, double d) {
		setName(n);
		setSubscription(d);
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name:- ");
		setName(sc.next());
		System.out.print("Enter sub:- ");
		setSubscription(sc.nextDouble());
		System.out.println();
		System.out.println("--------------------");
		System.out.println();
	}

	public void showData() {
		System.out.println("name is:- " + getName());
		System.out.println("sub is:- " + getSubscription());
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
	}

	public void setName(String n) {
		name = n;
	}

	public void setSubscription(Double s) {
		subscription = s;
	}

	public String getName() {
		return name;
	}

	public double getSubscription() {
		return subscription;
	}
}
