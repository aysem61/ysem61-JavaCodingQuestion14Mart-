package mart7sorulari;

import java.util.Scanner;

public class Q07_String {
	
	/*
	StringMethods:
		Write a Java program to extract the first half of a string of even length.
Example:
		     INPUT      :  Python
		    OUTPUT :   Pyt
    */


	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		String s="Python";
		
		System.out.println(s.substring(0,3));

	}

}
