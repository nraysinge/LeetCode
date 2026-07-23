package m.constructorhm_2dec;

import java.util.Scanner;

public class Bank {

	private String accountNumber, holdername;
	private int pin;
	private double balance;
	double b = 0;

	public Bank() {
		setAccountNumber("N/A");
		setHolderName("N/A");
		setAccountPin(0);
		setAccountBalance(0);
	}

	public Bank(String acNum, String holname, int key, double bal) {
		setAccountNumber(acNum);
		setHolderName(holname);
		setAccountPin(key);
		setAccountBalance(bal);
	}

	public void accpetData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Account Number:- ");
		setAccountNumber(sc.next());
		System.out.print("Enter The Account Holder Name:- ");
		setHolderName(sc.next());
		System.out.print("Enter The Account Pin:- ");
		setAccountPin(sc.nextInt());
		System.out.print("Enter The Account Balance:- ");
		setAccountBalance(sc.nextDouble());
		System.out.println("----------------------------");
	}

	public void showBalance() {
		System.out.println("Balance is:- " + getAccountBalance());
		System.out.println("----------------");
	}

	public void depositAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the correct pin if you want deposit amount in to you account:- ");
		int p = sc.nextInt();
		if (p == getAccountPin()) {
			System.out.println("pin is correct");
			System.out.print("Enter the amount to diposit in ac:- ");
			b = sc.nextDouble();
			if (b > 0) {
				System.out.println("Amt diposit successfully");
				System.out.println("--------");
				System.out.println("balance is :- " + (getAccountBalance() + b));
			} else {
				System.out.println("plese enter coorect amount avoid 0 less thann 0 amont ");
			}
		} else
			System.out.println("Enter correct pin");
	}

	public void withdrawalAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount to withdrawal:- ");
		double w = sc.nextDouble();
		System.out.print("Enter pin:- ");
		int p = sc.nextInt();
		if (p == getAccountPin()) {
			System.out.println("Pin is Correct");
			if (w > 0 && w < getAccountBalance()) {
				System.out.println("Amt withdrawal successfully");
				System.out.println("----------------------------------------------------");
				System.out.println("balance is:- " + (balance - w) + "/-");
			} else
				System.out.println("but you enterd invalid amount or insufficient balance in your account");
		} else
			System.out.println("Enter Correct pin");
	}

	public void setAccountNumber(String acNum) {
		accountNumber = acNum;
	}

	public void setHolderName(String holname) {
		holdername = holname;
	}

	public void setAccountPin(int key) {
		pin = key;
	}

	public void setAccountBalance(double bal) {
		balance = bal;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holdername;
	}

	public int getAccountPin() {
		return pin;
	}

	public double getAccountBalance() {
		return balance;
	}

	public void showData() {
		System.out.println("customer AC Number:- " + getAccountNumber());
		System.out.println("AC Holder name:- " + getHolderName());
		System.out.println("coustmer pin number:- " + getAccountPin());
		System.out.println("coustmer balance:- " + (b + getAccountBalance()));
		System.out.println("----------------------------");
	}
}

/// anouther logic///
/*
 * System.out.println("Enter deposit amount :- "); double amt=sc.nextDouble();
 * System.out.println("Enter the pin"); int temp=sc.nextInt(); double
 * n=getAccountBalance();
 * 
 * if(amt>0 && temp==getAccountPin()) { setAccountBalance(amt+n);
 * System.out.println("amt deposit succesfully");
 * System.out.println("total bal:- "+getAccountBalance()); }else
 * System.out.println("plses enter valid amt");
 * 
 * 
 */

//whithout getter setter method//
// accountNumber=acNum;
// holdername=holname;
// pin=key;
// balance=bal;

//whithout getter setter method//
// accountNumber="1585855";
// holdername="Mayur koli";
// pin=1258;
// balance=52898.36;

//System.out.print("Enter the amount to diposit in ac:- ");
//double b=sc.nextDouble();
//balance=getAccountBalance()+b;
//System.out.println("Now Balance is:- "+balance);
//}else if(p!=pin) {
//System.out.println("Enter correct pin");
//}