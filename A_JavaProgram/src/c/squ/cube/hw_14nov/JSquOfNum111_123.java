package c.squ.cube.hw_14nov;

public class JSquOfNum111_123 {

		public static void main(String[] args) {
			int squ=0;
				for(int a=111; a<=123; a++) {
					if(a%4==0 && a%7==0) {
						squ=a*a;
						System.out.println(squ);
					}
					
				}
		}
}
