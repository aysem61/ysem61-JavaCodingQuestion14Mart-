package mart7sorulari;

import java.util.Scanner;

public class Q01_SwitchCase {

	public static void main(String[] args) {
		
		/* 
		Write the Switch Case java code that prints the A, B, C, D, F notes that the user has entered.            
		           A Excellent				
		           B	Good				
		           C	Average				
		           D	Deficient				
		           F	Failing							
				 */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter a character");
		
		char s=scan.next().charAt(0);
		
		switch(s) {
		
		case 'A':
		case 'a':
			System.out.println("Excellent");
			break;
		case 'B':
		case 'b':	
			System.out.println("Good");
			break;
		case 'C':
		case 'c':	
			System.out.println("Average");
			break;
		case 'D':
		case 'd':	
			System.out.println("Deficient");
			break;
		case 'F':
		case 'f':
			System.out.println("Failing");
			break;
		default:
			System.out.println("Enter a valid character");
			
		
		}
		
		scan.close();

	}

}
