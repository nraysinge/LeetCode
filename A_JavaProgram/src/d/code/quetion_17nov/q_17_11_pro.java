package d.code.quetion_17nov;

import java.util.Scanner;

public class q_17_11_pro {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number");
		int y=sc.nextInt();
		int n=0;
		while(y>0) {
			n=y%10;
			if(n%2==0)
				System.out.println(n);
				y=y/10;
			
			sc.close();
		}
	}
}
