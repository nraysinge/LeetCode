package n.array_hw_3dec;

import java.util.Scanner;

public class ArrayFloat {
	
static float a[]=new float[5];
	
	public static void main(String[] args) {
		ArrayFloat a1=new ArrayFloat();
		a1.acceptArry(a);
		a1.showArray(a);	
	}
	
	public void acceptArry(float y[]) {
		int len=y.length;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value in array:- ");
		for(int j=0; j<len; j++) {
			y[j]=sc.nextFloat();
	
		}
	}
		public void showArray(float a[]) {
			System.out.println("value of array :- ");
			for(int f=0; f<a.length; f++) {
				System.out.print(a[f]+" | ");
			}
		
	}
}
