package c.squ.cube.hw_14nov;

public class ICubeOFNum111_123DiviBy3_5 {
	
	public static void main(String[] args) {
		
		int cube=0;
			for(int a=111; a<=123; a++) {
				if(a%3==0 && a%5==0) {
					cube=a*a*a;
						System.out.println(cube);
				}
			}
		}
	}
