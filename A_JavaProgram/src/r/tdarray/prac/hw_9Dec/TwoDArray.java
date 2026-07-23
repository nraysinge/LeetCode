package r.tdarray.prac.hw_9Dec;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		TwoDArray a1=new TwoDArray();
		a1.acceptArray(a);
		a1.acceptArray(b);
		a1.showArray(a);
		a1.showArray(b);
//		System.out.println("\n -:Addition of array value:-");
//		a1.arrayAddition(a, b);
//		System.out.println("\n -:Subtraction of array value:-");
//		a1.arraySubtraction(a, b);
//		int f[][]=a1.arrayMultiplication(a, b);
//		a1.showArray(f);
		int w[][]=a1.arrayDivide(a, b);
		a1.showArray(w);
	}
	
	public int[][] arrayDivide(int h[][], int o[][]){
		int c[][]=new int[3][3];
			for(int i=0; i<h.length; i++) {
				for(int j=0; j<o[i].length;j++) {
					c[i][j]=h[i][j]%o[i][j];
				}
			}
		return c;
	}
	
	public int [][]arrayMultiplication(int t[][], int d[][]) {
		int c[][]=new int[3][3];
			for(int i=0; i<t.length; i++) {
				for(int j=0; j<d[i].length; j++) {
					 c[i][j]=t[i][j]*d[i][j];
				}
			}
			return c;
	}
	
	public void arrayAddition(int q[][], int w[][]) {
		int c[][]=new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				c[i][j]=q[i][j]+w[i][j];
			}
		}
	showArray(c);
	}
	public void arraySubtraction(int a[][], int b[][]) {
		int c[][]=new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				c[i][j]=a[i][j]-b[i][j];
			}
		}
	showArray(c);
	}
	
	public void showArray(int y[][]) {
		System.out.println(" -: value of array :- ");
		for(int i=0; i<y.length; i++) {
			for(int j=0; j<y[i].length; j++) {
				System.out.print(y[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void acceptArray(int y[][]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter valuve:- ");
		for(int i=0; i<y.length; i++) {
			for(int j=0; j<y[i].length; j++) {
				y[i][j]=sc.nextInt(); // y[i][j] it means first row first chair 
			}							//                first row second chair
		}
	}
	
	
}
