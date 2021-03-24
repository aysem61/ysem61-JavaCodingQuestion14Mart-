package mart28sorulari;

public class Q01_Array_Reverse {
	
	
	1. 
	/* 
	* Write a Java program that reverse a sentence by using Array 
	* (with all spaces and special characters) 
	* Input : Coding is greate. 
	* Output : .etaerg si gnidoC 
	*/ 


	public static void main(String[] args) {
		
		String  arr[][]={ {"Coding is greate."}};
		
		int reverse[]=new int[arr.length];
		
		int a=0;
		
		for(int i=arr.length-1; i>=0; i--) {
			reverse[a]=arr[i];
			a++;
		}

	}

}
