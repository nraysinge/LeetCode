package d.code.quetion_17nov;

import java.util.Scanner;

public class o_17_11_program_que {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number");
		
		int a=sc.nextInt();
			int b=0;
				while(a>0) {
					b=a%10;
					int c=b*b*b;
					System.out.println(c);
					a=a/10;
					}
		sc.close();
	}
}
