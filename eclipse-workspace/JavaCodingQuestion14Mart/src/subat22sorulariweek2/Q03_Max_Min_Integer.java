package subat22sorulariweek2;

import java.util.Arrays;

public class Q03_Max_Min_Integer {
	
	/*
	Write the code that shows the Maximum and Minimum values ​​
	of integer data type on the console.
	*/

	public static void main(String[] args) {
		
	int [] a= {3,4,6,8,11,9};
	
	//System.out.println(Arrays.toString(a));
	
	//maxandmin(a);
	
	System.out.println(Arrays.toString(maxandmin2(a)));
		

	}

	public static int[]  maxandmin2(int[] a) {
		
		Arrays.sort(a);
		
		int b[]=new int[2];
		
		b[0]=a[0];
		
		b[1]=a[a.length-1];
		
		return b;
		
		
		
		
		
	}

	public static void maxandmin(int[] a) {
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("max: " + max  + "min: "+  min);
		
	}
     
	
}
