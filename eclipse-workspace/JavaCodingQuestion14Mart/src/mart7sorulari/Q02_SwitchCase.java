package mart7sorulari;

import java.util.Scanner;

public class Q02_SwitchCase {

	public static void main(String[] args) {
		
		/* 
		Write the Switch Case java code, which says how many days the user has entered for the month he entered.		 
		*/

		Scanner scan=new Scanner(System.in);
		
		int daysinMonth=0;
		String monthofname="Unknown";
		
		System.out.println("enter a month number");
		int month=scan.nextInt();
		
		System.out.println("enter a year");
		int year=scan.nextInt();
		
		switch(month) {
		case 1:
			monthofname="January";
			daysinMonth=31;
			break;
		case 2:
			monthofname="February";
			if((year%400==0) || (year%4==0) && (year%100!=0)){
				daysinMonth=29;
			}else {
				daysinMonth=28;
			}
			break;
		case 3:
			monthofname="March";
			daysinMonth=31;
			break;
		case 4:
			monthofname="April";
			daysinMonth=30;
			break;
		case 5:
			monthofname="May";
			daysinMonth=31;
			break;
		case 6:
			monthofname="June";
			daysinMonth=30;
			break;
		case 7:
			monthofname="July";
			daysinMonth=31;
			break;
		case 8:
			monthofname="August";
			daysinMonth=31;
			break;
		case 9:
			monthofname="September";
			daysinMonth=30;
			break;
		case 10:
			monthofname="October";
			daysinMonth=31;
			break;
		case 11:
			monthofname="November";
			daysinMonth=30;
			break;
		case 12:
			monthofname="December";
			daysinMonth=31;
		
	}
		System.out.println(monthofname + " " + year + "has" + daysinMonth + " days");
	}
}
