package b.loopingstatement_13Nov;

import java.util.Scanner;

public class loop_pra_difi {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		for (int a=1; a<=100; a++) {
		
			if(a%3==0 && a%5==0) {
				System.out.println("Mango and Apple");
			}
			else if (a%3==0) {
				System.out.println("Mango");
			}
			else if(a%5==0) {
				System.out.println("Apple");
			}
			else {
				System.out.println(a);
			}
			sc.close();
			}
		}

	}
