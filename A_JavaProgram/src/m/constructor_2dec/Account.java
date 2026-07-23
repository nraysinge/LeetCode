package m.constructor_2dec;

import java.util.Scanner;

public class Account {
	
	private String accountNumber; 
	private float balance;
	
	public Account() {
		setAccountNum("N/a");
		setBalance(0);
		
	}
	public Account(String acnum, float bal) {
		if(acnum==null || bal<=0) {
			System.out.println("Enter the valid ditials");
	}	else 
		setAccountNum(acnum);
		setBalance(bal);
	}
	
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("----------------------");
		System.out.print("Enter account num:- ");
		setAccountNum(sc.nextLine());
		System.out.print("Enter the ballance:- ");
		setBalance(sc.nextFloat());
		sc.close();
	}
	public void setAccountNum(String acnum) {
		accountNumber=acnum;
	}
	public void setBalance(float bal) {
		balance=bal;
	}
	public String getAccountNum() {
		return accountNumber;
	}
	public float getBallance() {
		return balance;
	}
	
	public void showAccountData() {
		System.out.println("--------------------------------");
		System.out.println("ac num :- "+getAccountNum());
		System.out.println("ac balance :- "+getBallance()+"/-");
	}
}
