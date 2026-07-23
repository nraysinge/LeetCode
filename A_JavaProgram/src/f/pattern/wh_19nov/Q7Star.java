package f.pattern.wh_19nov;

public class Q7Star {
	public static void main(String[] args) {
		//int sp=5;
		for(int r=1;r<=5;r++) {
			for(int c=1; c<=5; c++) {
			if(r==1 || r==5 || c==1 || c==5)
				System.out.print("* ");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
