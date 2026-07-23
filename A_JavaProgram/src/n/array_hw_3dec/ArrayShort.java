package n.array_hw_3dec;

import java.util.Scanner;

public class ArrayShort {
	static short a[]=new short[4];
		
		public static void main(String[] args) {
			ArrayShort a1=new ArrayShort();
			a1.acceptArry(a);
			a1.showArray(a);	
		}
		
		public void acceptArry(short y[]) {
			int len=y.length;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the value in array:- ");
			for(int j=0; j<len; j++) {
				y[j]=sc.nextShort();
		
			}
		}
			public void showArray(short a[]) {
				System.out.println("value of array :- ");
				for(int f=0; f<a.length; f++) {
					System.out.print(a[f]+" ");
				}
			
		}

}
