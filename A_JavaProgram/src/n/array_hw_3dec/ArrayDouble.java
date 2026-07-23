package n.array_hw_3dec;

import java.util.Scanner;

public class ArrayDouble {
	
static double a[]=new double[5];
	
	public static void main(String[] args) {
		ArrayDouble a1=new ArrayDouble();
		a1.acceptArry(a);
		a1.showArray(a);	
	}
	
	public void acceptArry(double y[]) {
		int len=y.length;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value in array:- ");
		for(int j=0; j<len; j++) {
			y[j]=sc.nextDouble();
	
		}
	}
		public void showArray(double a[]) {
			System.out.println("value of array :- ");
			for(int f=0; f<a.length; f++) {
				System.out.print(a[f]+" | ");
			}
		
	}
}


