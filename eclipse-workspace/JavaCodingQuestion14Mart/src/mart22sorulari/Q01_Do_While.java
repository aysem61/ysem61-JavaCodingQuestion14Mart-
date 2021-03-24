package mart22sorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01_Do_While {
	/*
	 * Ask User to enter numbers and add and print the numbers he entered then
	 * request the new number. If the sum of the numbers entered exceeds 100, Print
	 * “You entered …….. numbers. That's enough ! “ and finish the game.
	 * 
	 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println(" Please start to game with your entering numbers");

		int sum = 0;

		List<Integer> usersNums = new ArrayList<>();

		do {

			int num = s.nextInt();

			// System.out.println(" You entered this number "+num);
			for (int i = 0; i < usersNums.size(); i++) {

				usersNums.add(i, num);
			}

			sum += num;

		} while (sum <= 100);

		if (sum > 100) {
			System.out.println("You entered …….. numbers. That's enough !");
			System.out.println(usersNums + " your numbers ");
		}

	}

}
