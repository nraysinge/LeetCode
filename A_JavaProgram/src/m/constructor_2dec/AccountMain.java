package m.constructor_2dec;

public class AccountMain {

	public static void main(String[] args) {
		Account ac=new Account();
				ac.showAccountData();
		
		Account ac1=new Account("5855",545);
		ac1.showAccountData();
		
		Account ac2=new Account();
		ac2.acceptData();
		ac2.showAccountData();
	}
	
}
