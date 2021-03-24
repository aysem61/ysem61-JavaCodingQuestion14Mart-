package mart14sorulari;

import java.util.Scanner;

public class Q01_ForLoop {

	/*
	 * Ask user to enter a name and a character, then check how many times the
	 * character is repeated in the name using loops. e.g: char ch1= 'a' ; String
	 * name =“John came late" => number of a = 2
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter a name");

		String name = scan.nextLine();

		System.out.println("enter a character");

		char ch = scan.next().charAt(0);

		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(count + "number of a");

	}

}
