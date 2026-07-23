package e.numberpattern.hm18nov;

public class que_3_total_prime_number_check {

	public static void main(String[] args) {
		
		int num=0, p=0;
		for(p=1; p<=100; p++) {
			int count=0;
		for(num=p;num>=1;num--)	{
			if(p%num==0) {
				count++;
			}
		}
			if(count==2) {
			System.out.print(p+", ");
			}
		}
		System.out.println("total prime number is := ");
	}
}