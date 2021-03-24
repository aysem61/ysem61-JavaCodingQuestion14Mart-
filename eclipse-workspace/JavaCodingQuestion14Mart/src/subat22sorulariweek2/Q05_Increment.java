package subat22sorulariweek2;

public class Q05_Increment {
	
	/*
	Assign two values : 
	num1=1,
	num2=1 
	Then print the multiplication table using ‘increment’ 
	Note: When you use ++ increment sign then it increases by 1 
	Print The Following multiplication table:
	1 X 1 = 1
	1 X 2 = 2  
	1 X 3 = 3
	...
	1 X 10 =10
	*/


	public static void main(String[] args) {
		
	int	num1=3;
	
	int num2=1;
	
	while(num2<11) {
		
		System.out.println(num1+" x " +num2 + " = " +(num1*num2));
		
		num2++;
	}
		
		

	}

}
