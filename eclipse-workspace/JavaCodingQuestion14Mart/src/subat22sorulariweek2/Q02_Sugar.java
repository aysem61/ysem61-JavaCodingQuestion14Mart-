package subat22sorulariweek2;

import java.util.Scanner;

public class Q02_Sugar {
	
	/*
	Ask the user how many tea they drink and how many sugars they use a day. Calculate how many kg of sugar is used in a year and print it.
	1 sugar = 1.7 gr
	Sample: Input ⇒      
	Tea : 10
	Sugar :2
	Output : 12.41 kg/year
	*/  


	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many tea they drink a day");
		
		int tea=scan.nextInt();
		
		System.out.println("How many sugars they use a day");
		
		double sugar=scan.nextDouble();
		
		double usageYEarly=tea*sugar*1.7*365/1000;

		System.out.println(usageYEarly);
		
		

	}

}
