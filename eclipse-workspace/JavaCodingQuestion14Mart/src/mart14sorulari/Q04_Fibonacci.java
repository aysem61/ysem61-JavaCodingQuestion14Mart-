package mart14sorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_Fibonacci {

	/*
	 * Get numbers from the user and output that number consecutive fibonacci number
	 * sequence e.g : User enters 10 output : 0 1 1 2 3 5 8 13 21 34
	 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Please enter a number for fibonaccis last limit ...");

		int limit = s.nextInt();

		List<Integer> fibo = new ArrayList<>();

		fibo.add(0);
		fibo.add(1);

		for (int i = 2; i < limit; i++) {

			fibo.add(fibo.get(i - 2) + fibo.get(i - 1)); // static solution

			if (fibo.get(i) >= limit) {
				break;
			}

		}

		System.out.println(fibo);
		System.out.println("********************************");
		fib();
	}

	private static void fib() {
		// TODO Auto-generated method stub
		
		int limit=5;
		
		int num1=0;
		
		int num2=1;
		
		int sum=0;
		
		for(int i=1; i<=limit; ++i) {
			
			System.out.print(num1+" ");
			
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
			
		}
		
	}

}
