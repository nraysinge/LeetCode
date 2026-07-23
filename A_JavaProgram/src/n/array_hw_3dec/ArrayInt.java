package n.array_hw_3dec;

import java.util.Scanner;

public class ArrayInt {

	public static void main(String[] args) {
		int y[]=new int[5];
		//int a=100;
		ArrayInt a1=new ArrayInt();
		a1.acceptArray(y);
		a1.showArry(y);
		
	}
	public void showArry(int a[]) {
		System.out.println("value from the array :- ");
		for(int k=0; k<a.length; k++) {
			System.out.print(a[k]+" ");
		}
	}
		public void acceptArray(int y[]) {
		int len=y.length;
		System.out.println("Lenth :- "+len);
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the num in array:- ");
		for(int k=0;k<len;k++) {
			y[k]=sc.nextInt();
		}
	}
}
