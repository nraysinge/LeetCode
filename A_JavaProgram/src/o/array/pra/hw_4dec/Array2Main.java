package o.array.pra.hw_4dec;

public class Array2Main {
	public static void main(String[] args) {
		int a[] = new int[2];
		Array2 c = new Array2();
		c.acceptData(a);
		// c.cube(a);
		// c.oddNum(a);
		// c.squareOfEvenNum(a);
		// c.squareOfOddNum(a);
//		int g=c.retSumOddNum(a);
//		System.out.println("Sum is:- "+g);
//		int l=c.retSumEvenNum(a);
//		System.out.println("Sum is:- "+l);
//		int l=c.retProdOddNum(a);
//		System.out.println("pro is:- "+l);
//		int l=c.retProdEvenNum(a);
//		System.out.println("pro is:- "+l);
//		int m=c.retSumOfSqaureOFElement(a);
//		System.out.println("sum is:- "+m);
//		int z=c.retSumOfCubeOfElement(a);
//		System.out.println("sum is:- "+z);
		int x = c.retProdofSqueofElem(a);
		System.out.println("sum is:- " + x);
		int h = c.retProdofCubeofElem(a);
		System.out.println("sum is:- " + h);
	}
}