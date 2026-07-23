package f.pattern.que_19nov;

public class Pa12MirrorPrint {

	public static void main(String[] args) {
		for(int r=1; r<=5; r++) {
			int sp=5;
			for(int k=1; k<=(sp-r);k++)
				System.out.print("  ");
			for(int c=1; c<=r; c++) {
				
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
