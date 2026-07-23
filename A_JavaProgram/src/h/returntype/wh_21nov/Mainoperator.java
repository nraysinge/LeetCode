package h.returntype.wh_21nov;

import java.util.Scanner;

public class Mainoperator {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Witch Operation you want to perphorm press"
							+"1 for additon "+"2 for subtraction "
							+"3 for multiplication "+" 4 for division "
							+"5 for modulo ");
		int q=sc.nextInt();
		
		MainOperation M1=new MainOperation();
		
		switch(q) {
		case 1:
		int d=M1.addition();
		System.out.println("Addition is :- "+d);
		break;
		
		case 2:
		int e=M1.subtraction();
		System.out.println("Subtraction is :- "+e);
		break;
		
		case 3:
		int f=M1.multiplication();
		System.out.println("Multiplication is :- "+f);
		break;
		
		case 4:
		int g=M1.division();
		System.out.println("Division is :- "+g);
		break;
		
		case 5:	
		int h=M1.modulo();
		System.out.println("Mod is :- "+h);
		break;
		
		default:
		System.out.println("Plese Enter valid number bitween 1 to 5");
		sc.close();
		}
	}

}
