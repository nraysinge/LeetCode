package a.basicsprogram10novto16nov25;

import java.util.Scanner;

public class VowalCheck {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter The Charecter");
			
				char ch=sc.next().charAt(0);
				
					switch(ch) {
					
						case 'a':
						System.out.println("It s Vowal");
						break;
						case 'e':
							System.out.println("It s Vowal");
							break;
						case 'i':
							System.out.println("It s Vowal");
							break;
						case 'o':
							System.out.println("It s Vowal");
							break;
						case 'u':
							System.out.println("It s Vowal");
							break;
							
						default:
							System.out.println("Not a Vowal");
					sc.close();
					}
		
	}
}
