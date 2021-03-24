package subat22sorulariweek2;

import java.util.Scanner;

public class Q04_Sum_Digits {
	
	/*
	Ask user to enter a three digits number and find 
	the sum of digits of this number.
	*/


	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a three digits number");
		
		int a=scan.nextInt();
		
		int sum=0;
		
		while(a>0) {
			
			int lastnumber = a%10;
		
			sum+=lastnumber;
			
			a=a/10;
		}	
		System.out.println(sum);
	}

}
