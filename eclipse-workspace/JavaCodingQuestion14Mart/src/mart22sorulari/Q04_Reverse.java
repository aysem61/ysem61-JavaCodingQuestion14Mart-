package mart22sorulari;

import java.util.Scanner;

public class Q04_Reverse {
	
	/*
	Write the method that will print the reverse of the number you received from the user on the console.

	*/


	public static void main(String[] args) {
		
		reverse ();
	
	}


	public static  void reverse() {
		
		
		int num=12345;
		int rev_num=0;
		
		
		while(num>0) {
			
			rev_num=rev_num*10 +num%10;
					
			num=num/10;		
		}
		
		System.out.println("num : " + rev_num);
		
		
		
		
		
		
		

		
		
		
		
		
		
	}

}
