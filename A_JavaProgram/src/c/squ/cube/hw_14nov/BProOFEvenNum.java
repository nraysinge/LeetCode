package c.squ.cube.hw_14nov;

public class BProOFEvenNum { // even number multiplication print
	
	public static void main(String[] args) {
		
		int product=1;
		
		for(int a=12; a<=35; a++) {
			
			if(a%2==0) 
				
				product*=a;
				
		}
				System.out.println(product);
			
			
		
	}
}
