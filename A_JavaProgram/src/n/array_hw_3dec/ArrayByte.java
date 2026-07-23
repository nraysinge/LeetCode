package n.array_hw_3dec;

import java.util.Scanner;

public class ArrayByte {
	
	static byte a[]=new byte[3];
	
	public static void main(String[] args) {
		ArrayByte a1=new ArrayByte();
		a1.acceptArry(a);
		a1.showArray(a);	
	}
	
	public void acceptArry(byte y[]) {
		int len=y.length;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value in array:- ");
		for(int j=0; j<len; j++) {
			y[j]=sc.nextByte();
			
		}
	}
		public void showArray(byte a[]) {
			System.out.println("value of array :- ");
			for(int f=0; f<a.length; f++) {
				System.out.print(a[f]+" ");
			}
		
	}
}


