package b.loopingstatement_13Nov;

import java.util.Scanner;

public class lopp_pra {
	
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Plese Enter The Starting Number to divide by 4 and 7");
	int start=sc.nextInt();
	
	System.out.println("Plese Enter The ending Number to divide by 4 and 7");
	int end=sc.nextInt();
	
	int a;
	for(a=start; a<=end; a++) {
			if(a%4==0 && a%7==0) {
			System.out.println("The Givin both"+start+end+ "Number Divided By 3 and 4 are here :-  "+a);
		}
			sc.close();		
	}

	
}
	
}
