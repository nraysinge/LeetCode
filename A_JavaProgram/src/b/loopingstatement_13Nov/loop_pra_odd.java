package b.loopingstatement_13Nov;

import java.util.Scanner;

public class loop_pra_odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
	
		System.out.println("Enter the num up to which you want odd number");
		int num=sc.nextInt();
		
		for(int a=1; a<=num; a++) {
			if(a%2!=0) {
				System.out.println(a);
			}

			
			
			sc.close();
		}
		
		}

}
