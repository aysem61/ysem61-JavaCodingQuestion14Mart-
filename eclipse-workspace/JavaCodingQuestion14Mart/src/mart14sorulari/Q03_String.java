package mart14sorulari;

import java.util.Scanner;

public class Q03_String {

	public static void main(String[] args) {
		
		/*
		Write a code that returns the duplicate chars in a String array e.g. 
		String str=“ilovejavatoo” 
		Output: o v a
		         	*/

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a String");
		
		String str=scan.nextLine();
		
		System.out.println(str.substring(2,3)+" "+str.substring(3,4)+" "+str.substring(6,7));
		

	}

}
