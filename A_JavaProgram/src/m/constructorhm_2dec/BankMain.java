package m.constructorhm_2dec;

public class BankMain {
	public static void main(String[] args) {
//		Bank b1=new Bank ();
//		b1.showData();
//		
//		Bank b2=new Bank("1212121","mayur",1212,552.30);
//		b2.showData();
		
		Bank b3=new Bank();
		b3.accpetData();
		b3.showData();
		b3.showBalance();
		//b3.depositAmount();
		//b3.showBalance();
		b3.withdrawalAmount();
	}

}
