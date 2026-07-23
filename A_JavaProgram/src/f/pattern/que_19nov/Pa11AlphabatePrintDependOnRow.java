package f.pattern.que_19nov;

public class Pa11AlphabatePrintDependOnRow {
	public static void main(String[] args) {
		
		for(int r=1; r<=5; r++) {
			char ch='A';
			for (int c=1; c<=r; c++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}


}
