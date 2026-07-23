package c.squ.cube.hw_14nov;

public class HCubeOfEvenNum {

		public static void main(String[] args) {
			int cube=0;
				for (int a=111; a<=123; a++){
					if (a%2==0) {
						cube=a*a*a;
							System.out.println(cube);
				}
			}
		}
}
