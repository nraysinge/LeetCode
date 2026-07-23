package c.squ.cube.hw_14nov;

import java.util.Scanner;

public class ASumOfOddNnum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the number from which you want to sum of odd number. ");
		int a=sc.nextInt();
		
		System.out.println("Enter the number up to which you want to add up the odd numbers. ");
		int b=sc.nextInt();
			
			int sum=0;
				for(int c=a; c<=b; c++){
					if(c%2!=0)
						sum=sum+c;
						}
							System.out.println(sum);
						
						sc.close();
					}
				} 
