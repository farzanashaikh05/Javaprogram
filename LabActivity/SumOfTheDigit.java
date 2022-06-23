package javacourse;
/*
 *@Author Farzana Shaikh 
 */

public class SumOfTheDigit {

	public static void main(String[] args) {
			
		    sumofdigit();//method calling
		
	}

	private static void sumofdigit() {
		int n=67;// declaring the number	
		int rem=0;//initializing variable for storing remainder value 
		int sum=0;//initializing variable for storing sum of digit
		
		System.out.println("Number is: "+n);
		
		//while loop for terminating the iteration 
		while(n>0) {
			
		//below Calculation for sum of digit
		rem=n%10;
		
		sum=sum+rem;
		
		n=n/10;
		}
		
		//printing Statement
		System.out.println("Sum of digit:"+sum);
	}

}
