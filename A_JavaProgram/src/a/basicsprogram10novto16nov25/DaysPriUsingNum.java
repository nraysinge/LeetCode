package a.basicsprogram10novto16nov25;

import java.util.Scanner;

public class DaysPriUsingNum {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
					
			System.out.println("Enter Teh Number In  1 To 7 for Day Name");

				int a=sc.nextInt();
		sc.close();		
				switch(a){
				
					case 1:
						System.out.println("Monday");
							break;
					
					case 2:
						System.out.println("Thusday");
							break;
							
					case 3:
						System.out.println("Wednasday");
							break;
							
					case 4:
						System.out.println("Thursday");
							break;
							
					case 5:
						System.out.println("Friday");
							break;
							
					case 6:
						System.out.println("Saturday");
				
						break;
						
					case 7:
						System.out.println("Sunday");
							break;
							
					default:
						System.out.println("Plese Enter The Number Bitwin 1 to 7 For Day Name");
							break;
					
				}
		}
}
