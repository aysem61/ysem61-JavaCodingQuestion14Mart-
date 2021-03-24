package mart22sorulari;

public class Q03_For_Loop {
	
	/*
	Create a method called numberOfChars and pass 2 parameters; 
	1. car 
	2. String
		char ch = 'p';
		String str = "population is number of people";
		int count = 0;
	then find how many times the given char is repeated in the String and print it on the console
	*Use for loop, increment and if statements
			*/

	

	public static void main(String[] args) {
		
		
		numberOfChars();



	}

	public static void numberOfChars() {
		
		String str = "population is number of people";
		
		char ch = 'p';
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		
		System.out.println(count + " number of p");
	}

}
