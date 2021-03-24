package mart14sorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_Break_Continue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// printEven();
		// printOdd();
		// printDivisible();
		// printSumEven();
		printAllNumbers();
	}

	/*
	 * a.Print even numbers between 1-20 inclusive. e.g.2 4 6 .. 20
	 * 
	 */

	public static void printEven() {

		for (int i = 2; i <= 20; i = i + 2) {
			System.out.print(i + " ");
		}
	}

	/*
	 * Print odd numbers between 1-20 inclusive. e.g 1,3,5,7,...,19 Including comma!
	 * 
	 */

	public static void printOdd() {

		for (int i = 1; i < 20; i = i + 2) {
			System.out.print(i + " ,");
		}
	}

	/*
	 * Print all number that is divisible by 5 backward from 20-1 inclusive
	 * e.g.20,15,10,5
	 * 
	 */

	public static void printDivisible() {

		for (int i = 20; i >= 5; i = i - 5) {
			System.out.print(i + " ,");
		}

	}
	/*
	 * Find the sum of all even numbers from 1 - 20 inclusive
	 */

	public static void printSumEven() {

		int sum = 0;

		for (int i = 2; i <= 20; i = i + 2) {
			sum = sum + i;
		}
		System.out.print(sum + " ");
	}

	/*
	 * Print all numbers from 1-20 except 11 or 15; use break or continue.
	 */

	public static void printAllNumbers() {

		List<Integer> nums = new ArrayList<>();

		for (int i = 1; i <= 20; ++i) {
			nums.add(i);

		}
		
		System.out.println(nums);
		
		int i=0;
		
		while(i<=nums.size()) {
			
			
			if (nums.get(i)==11 || nums.get(i)==15) {
				i++;
				continue;
				
			}
			
			System.out.println(nums.get(i));
			i++;
		
		}

	}

}
