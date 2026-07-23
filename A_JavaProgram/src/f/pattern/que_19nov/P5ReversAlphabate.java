package f.pattern.que_19nov;

public class P5ReversAlphabate {
	public static void main(String[] args) {
		for(int r=1; r<=5; r++) {
			char ch='E';
			for(int c=1; c<=5; c++) {
				
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
	}

}
