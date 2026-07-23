package f.pattern.que_19nov;

public class Pa13PrintPiramid {
	
	public static void main(String[] args) {
		int sp=5;
		
		for(int r=1; r<=5; r++) {
			
			for(int k=1; k<=(sp-r); k++) {
				System.out.print(" ");
			}
				for(int c=1; c<=r; c++) {
				
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
