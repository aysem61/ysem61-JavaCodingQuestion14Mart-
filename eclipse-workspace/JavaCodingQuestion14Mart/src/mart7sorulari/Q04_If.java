package mart7sorulari;

import java.util.Scanner;

public class Q04_If {

	/*
	 * create 2 words : name1 and name2 if the name1 has even numbers of characters,
	 * then insert the second word in the middle of the first name if the first word
	 * has odd numbers Then print the “Name2 cannot be inserted in the name1” e.g:
	 * name1= mehmet name2= ahmet Print ==> mehahmetmet
	 */

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a first name");
		
		String name1=scan.nextLine();
		
		
		
		if (name1.length()%2==0) {
			System.out.println(name1.substring(0,3));
		}
		System.out.println("Please enter a second name");
		
		String name2=scan.nextLine();
		
		System.out.println(name1.substring(0,3)+ name2 +(name1.substring(3)));
		
		

	}

}
