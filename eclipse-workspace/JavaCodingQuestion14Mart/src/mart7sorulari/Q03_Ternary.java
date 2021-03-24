package mart7sorulari;

import java.util.Scanner;

public class Q03_Ternary {

	public static void main(String[] args) {
		
		 
		/*Write a code using ternary:
		 * 
				Create int variable : price
				
				Create string variable : decision
				
				If the price = $10 Print “cheap”
				
				If price is 10-$20 print “ok”
				
				Otherwise “expensive”.
				*/

		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter a price");
		
		int price=scan.nextInt();
		
		String result1=(price>=10 || price<=20) ?  (price==10 ? "the price is cheap":"the pricee is ok " ):(price>20 ? "The price is expensive":"the price is ok " );
		
		System.out.println(result1);

	}

}
