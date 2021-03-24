package mart14sorulari;

import java.util.Scanner;

public class Q05_ForLOOP {

	/*
	 * String day= "8MARCH"; use charAt method and loop then print all letters on
	 * the console
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter a day");

		String day = scan.nextLine();

		for (int i = 0; i < day.length(); i++) {

			System.out.print(day.charAt(i)+" ");

		}

	}
}
