package e.numberpattern.hm18nov;

public class que_3_prime_num_count {
	public static void main(String[] args) {
		
		int count=0;
		for(int n=2; n<=100; n++) {
			boolean prime=true;
			for(int i=2; i<n; i++) {
				if(n%i==0) {
					prime=false;
					break;
				}
			}
			if(prime) {
				count++;
		}
	}
		System.out.println("total prime number is :- "+count);
	}
}
