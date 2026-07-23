package d.code.quetion_17nov;

public class m_17_11_fibbonasi {
	
	public static void main(String[] args) {
		
		int n1=0, n2=1, n3=0;
		
		System.out.print(n1+" "+n2);
		
		for(int a=1; a<=10; a++) {
			
			n3=n1+n2;
			
			System.out.print(" "+n3);
			
			n1=n2;
			
			n2=n3;
		}
	}
}
