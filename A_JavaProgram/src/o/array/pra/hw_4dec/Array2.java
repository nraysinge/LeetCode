package o.array.pra.hw_4dec;

import java.util.Scanner;

public class Array2 {

	public void acceptData(int b[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value:- ");
		for (int c = 0; c <b.length; c++) {
			b[c] = sc.nextInt();
		}
	}

	public void cube(int e[]) {
		for (int f = 0; f < e.length; f++) {
			int g = e[f] * e[f] * e[f];
			System.out.println(g);
		}
	}

	public void oddNum(int h[]) {
		for (int i = 0; i < h.length; i++) {
			if (h[i] % 2 != 0)
				System.out.println("odd num is:- " + h[i]);
		}
	}

	public void squareOfEvenNum(int j[]) {
		for (int h = 0; h < j.length; h++) {
			if (j[h] % 2 == 0) {
				int squ = j[h] * j[h];
				System.out.println("square is:- " + squ);
			}
		}
	}

	public void squareOfOddNum(int j[]) {
		for (int h = 0; h < j.length; h++) {
			if (j[h] % 2 != 0) {
				int squ = j[h] * j[h];
				System.out.println("square is:- " + squ);
			}
		}
	}

	public void cubeOfEvenNum(int j[]) {
		for (int h = 0; h < j.length; h++) {
			if (j[h] % 2 == 0) {
				int cube = j[h] * j[h] * j[h];
				System.out.println("cube is:- " + cube);
			}
		}
	}

	public void cubeOfOddNum(int j[]) {
		for (int h = 0; h < j.length; h++) {
			if (j[h] % 2 != 0) {
				int cube = j[h] * j[h] * j[h];
				System.out.println("cube is:- " + cube);
			}
		}
	}

	public int retSumOddNum(int x[]) {
		int j = 0;
		for (int s = 0; s < x.length; s++) {
			if (x[s] % 2 != 0)
				j = j + x[s];
		}
		return j;
	}

	public int retSumEvenNum(int y[]) {
		int j = 0;
		for (int s = 0; s < y.length; s++) {
			if (y[s] % 2 == 0)
				j = j + y[s];
		}
		return j;
	}

	public int retProdOddNum(int s[]) {
		int prod = 1;
		for (int h = 0; h < s.length; h++) {
			if (s[h] % 2 != 0)
				prod = s[h] * s[h] * s[h];
		}
		return prod;
	}

	public int retProdEvenNum(int s[]) {
		int prod = 1;
		for (int h = 0; h < s.length; h++) {
			if (s[h] % 2 == 0)
				prod = s[h] * s[h] * s[h];
		}
		return prod;
	}

	public int retSumOfSqaureOFElement(int l[]) {
		int sum = 0;
		for (int s = 0; s < l.length; s++) {
			int sqau = l[s] * l[s];
			sum = sum + sqau;
		}
		return sum;
	}

	public int retSumOfCubeOfElement(int o[]) {
		int sum = 0;
		for (int k = 0; k < o.length; k++) {
			int cube = o[k] * o[k] * o[k];
			sum = sum + cube;
		}
		return sum;
	}

	public int retProdofSqueofElem(int p[]) {
		int pro = 1;
		for (int u = 0; u < p.length; u++) {
			int squ = p[u] * p[u];
			pro = pro * squ;
		}
		return pro;
	}

	public int retProdofCubeofElem(int p[]) {
		int pro = 1;
		for (int u = 0; u < p.length; u++) {
			int cube = p[u] * p[u] * p[u];
			pro = pro * cube;
		}
		return pro;
	}
}
