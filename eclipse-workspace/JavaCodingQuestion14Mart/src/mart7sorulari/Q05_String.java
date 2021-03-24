package mart7sorulari;

import java.util.Scanner;

public class Q05_String {
	
	/*
	Ask user to enter a word.
	
	 If the word has odd number of characters lenth() of characters and has 3 or more characters, 
	 
	 print the character in the middle of the word.

	*/
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a word");
		
		String s=scan.nextLine();
		
		if(s.length()>=3 && s.length()%2!=0) {
			
			int l=s.length()/2;
			System.out.println("Enter word "+s+" Midfix "+s.substring(l-1, l+2));
			
			String yeni=s.substring(0,l-1)+s+s.substring(l+2);
			
			System.out.println("new word is ..."+yeni);
			
		}else {
			System.out.println(" the length of word is not odd "+s);
		}
		

	}

}
