package f.pattern.que_19nov;

public class P9DipendOnRow {
	
	public static void main(String[] args) {
		
		for(int r=1; r<=5; r++) {
//			if(r==1)
//				System.out.print("* ");
//			
//			r++;
			
			for(int c=1; c<=r; c++) {
//				
//				if(c==1)
					System.out.print("* ");
//				c++;
			}
			
			System.out.println();
		}
	}

}
