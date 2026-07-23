package q.array.practical.hw_8Dec;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		int a[] = new int[5];
		ArraySort k = new ArraySort();
		k.acceptValue(a);
		k.sortArrayAsending(a);
		System.out.println("----------Asending Order----------");
		k.showArray(a);
		k.sortArrayDesnding(a);
		System.out.println("----------desending Order----------");
		k.showArray(a);
		

	}

	public void acceptValue(int n[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The value:- ");
		for (int y = 0; y < n.length; y++) {
			n[y] = sc.nextInt();
			
		}
	}

	public void sortArrayAsending(int b[]) {
		for (int i = 0; i < b.length; i++) {
			for (int j = i ; j < b.length; j++) {
				if (b[i] > b[j]) {
					int t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
			}
		}
	}
	
	public void sortArrayDesnding(int b[]) {
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] < b[j]) {
					int t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
			}
		}
	}
	
	public void showArray(int s[]) {
	//	System.out.println("-------------------");
		for (int a = 0; a < s.length; a++) {
			System.out.println("sorting array:- " + s[a]);
		}
	}
}
