package javacourse;
/*
 * @Author Farzana Shaikh
 */

public class ReverseNumber {

	public static void main(String[] args) {
		revnum();
		
	}
     //method for reverse number
	private static void revnum() {
		
		int num=67432;// declaring the number	
		int rev=0;//initializing variable for storing reverse value 
		int rem=0;//initializing variable for storing remainder value
		
		System.out.println("Number is: "+num);
		
		//while loop for terminating the iteration 
		while(num!=0) {	
			
			//logic of reverse number
		    rem=num%10;
		    
		    rev= rev*10+rem;
		    
		    
		    num=num/10;
		
		
		}
		
		//printing reverse number
		System.out.println("Reversed Number is:"+rev);
	}



	}

