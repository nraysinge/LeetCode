package f.pattern.wh_19nov;

public class Q1StarPiramid {
	public static void main(String[] args) {
		int sp=7;
		for(int r=1; r<=7; r++) {

			for(int k=1; k<=(sp-r); k++) {
				System.out.print(" ");
			}
			for(int c=1; c<=r; c++) {
				System.out.print("* ");
			}
				System.out.println();
			}
		}
	}