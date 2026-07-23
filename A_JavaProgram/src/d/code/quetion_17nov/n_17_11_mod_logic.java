package d.code.quetion_17nov;

import java.util.Scanner;

public class n_17_11_mod_logic {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number");
		
		int y=sc.nextInt();
		
		int n=0;
		
		while(y>0){
			System.out.println(y);
			n=y%10;
			
			System.out.println(n);
			y=y/10;
			
		}
	sc.close();
	}

}
