package f.pattern.que_19nov;

public class Pa10NumberPrintDependOnRow {
	
	public static void main(String[] args) {
		
		for(int r=1; r<=5; r++) {
			for(int c=1; c<=r; c++) {
				System.out.print(c+" ");
			}
				System.out.println();
		}
	}

}
