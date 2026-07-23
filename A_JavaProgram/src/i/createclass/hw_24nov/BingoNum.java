package i.createclass.hw_24nov;

import java.util.Scanner;

public class BingoNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number To Check Number Is Bingo Or Not");
		int b=sc.nextInt();
		
		int temp=b;
		boolean hasSeven=false;
		
		while(temp>0) {
			int digt=temp%10;
			if(digt==7) {
				hasSeven=true;
				break;
			}
			temp=temp/10;
		}
		
		if(b%7==0 && !hasSeven)
			System.out.println(b+" number is bingo");
		else
			System.out.println(b+" number is not bingo");
		sc.close();
		
	}
}
