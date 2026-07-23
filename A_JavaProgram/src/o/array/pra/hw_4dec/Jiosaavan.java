package o.array.pra.hw_4dec;

import java.util.Scanner;

public class Jiosaavan {
	public static void main(String[] args) {
//		Jiosaavan j=new Jiosaavan();
//		j.acceptData();
//		j.showData();
		Jiosaavan j1=new Jiosaavan();
		j1.showData();
		Jiosaavan j2=new Jiosaavan(1221,"fdfdf","fdfd",250.30);
		j2.showData();
	}

	private int id;
	private String name, language;
	private double subscription_amount;
	
	public Jiosaavan() {
		setID(00);
		setName("N/a");
		setlanguage("N/A");
		setSubcriptionAmount(00.00);
	}
	
	public Jiosaavan(int i, String n, String l, double s) {
		setID(i);
		setName(n);
		setlanguage(l);
		setSubcriptionAmount(s);
	}
	
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the id:- ");
		setID(sc.nextInt());
		System.out.print("Enter name:- ");
		setName(sc.next());
		System.out.print("Enter language:- ");
		setlanguage(sc.next());
		System.out.print("Enter subscription amt:- ");
		setSubcriptionAmount(sc.nextDouble());
		System.out.println("-------------------------");
	}
	
	public void showData() {
		System.out.println("id is:- "+getID());
		System.out.println("name is:- "+getName());
		System.out.println("language is:- "+getlanguage());
		System.out.println("subscription amt is:- "+getSubscriptionAmount());
	}
	public void setID(int i) {
		id = i;
	}
	public void setName(String o) {
		name = o;
	}
	public void setlanguage(String p) {
		language = p;
	}
	public void setSubcriptionAmount(double l) {
		subscription_amount = l;
	}
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getlanguage() {
		return language;
	}
	public double getSubscriptionAmount() {
		return subscription_amount;
	}
}
