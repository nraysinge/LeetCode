package f.pattern.wh_19nov;

public class Q3AbcdPiramid {
	public static void main(String[] args) {
		int sp=5;
		for(int r=1; r<=5; r++) {
			
			for(int k=1; k<=(sp-r); k++) {
				System.out.print(" ");
			}
			char ch='A';
			for(int c=1; c<=r; c++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
