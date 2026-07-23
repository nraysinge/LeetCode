package q.array.practical.hw_8Dec;

import java.util.Scanner;

public class Jiosaavn {
	private int id;
	private String name, language;
	private double subscription_amount;

	private static Jiosaavn jioarray[] = new Jiosaavn[2];

//	public Jiosaavn() {
//		setID(000);
//		setName("na");
//		setLanguage("abc");
//		setSubscriptionAmt(00.00);
//		//showData();
//	}
//	public Jiosaavn(int i, String n, String l, double s) {
//		setID(i);
//		setName(n);
//		setLanguage(l);
//		setSubscriptionAmt(s);
//		//showData();
//	}

	public static void JiosavaanSortbyPrise() {
		for(int i=0; i<jioarray.length; i++) {
			for(int j=0; j<jioarray.length; j++) {
				if(jioarray[i].getSubscriptionAmt()<jioarray[j].getSubscriptionAmt()) {
					Jiosaavn j1=jioarray[i];
					jioarray[i]=jioarray[j];
					jioarray[j]=j1;
				}
			}
		}
	}
	public static void JioSaavnAccseptArray() {
		for (int i = 0; i < jioarray.length; i++) {
			jioarray[i] = new Jiosaavn();
			jioarray[i].acceptData();
		}
	}

	public static void JioSavvanShowArray() {
		for (int j = 0; j < jioarray.length; j++) {
			jioarray[j].showData();
		}
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter Id:- ");
		setID(sc.nextInt());
		System.out.print("Enter Name:- ");
		setName(sc.next());
		System.out.print("Enter languge:- ");
		setLanguage(sc.next());
		System.out.print("Enter Amt :- ");
		setSubscriptionAmt(sc.nextDouble());
	}

	public void showData() {
		System.out.println();
		System.out.println(" -: jioSavan user detials :- ");
		System.out.println();
		System.out.println("ID is:- " + getId());
		System.out.println("Name is:- " + getName());
		System.out.println("language is:- " + getLanguage());
		System.out.println("Subscription Amt is:- " + getSubscriptionAmt());
	}

	public void setID(int p) {
		id = p;
	}

	public void setName(String n) {
		name = n;
	}

	public void setLanguage(String l) {
		language = l;
	}

	public void setSubscriptionAmt(double s) {
		subscription_amount = s;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLanguage() {
		return language;
	}

	public double getSubscriptionAmt() {
		return subscription_amount;
	}

}
