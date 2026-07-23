package n.array_hw_3dec;

import java.util.Scanner;

public class ArrayLong {
	static long a[]=new long[8];
	
	public static void main(String[] args) {
		ArrayLong a1=new ArrayLong();
		a1.acceptArry(a);
		a1.showArray(a);	
	}
	
	public void acceptArry(long y[]) {
		int len=y.length;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value in array:- ");
		for(int j=0; j<len; j++) {
			y[j]=sc.nextLong();
	
		}
	}
		public void showArray(long a[]) {
			System.out.println("value of array :- ");
			for(int f=0; f<a.length; f++) {
				System.out.print(a[f]+" ");
			}
		
	}

}
