package d.code.quetion_17nov;

import java.util.Scanner;

public class p_17_11_que {

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The number");
			int a=sc.nextInt();
			int b=0;
			while(a>0) {
				b=a%10;
				int c=b*b;
				System.out.print(c);
				a=a/10;
			}
		sc.close();
		}
}
