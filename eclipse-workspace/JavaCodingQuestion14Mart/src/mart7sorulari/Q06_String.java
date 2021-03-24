package mart7sorulari;

import java.util.Scanner;

public class Q06_String {
	
	/* 
	Ask user to enter firstName and lastName then make first initials uppercase and rest should be all lovercase
	ferhat => Ferhat
	kirac => Kirac
	          */


	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in) ;
			
		System.out.println("Please enter firstName");
		
		String first=scan.nextLine().toLowerCase();
		
		System.out.println(first.substring(0,1).toUpperCase() + first.substring(1));
		
		
		
		System.out.println("Please enter lastName");
		
		String last=scan.nextLine().toLowerCase();
		
		System.out.println(last.substring(0,1).toUpperCase() + last.substring(1));
		

	}

}
