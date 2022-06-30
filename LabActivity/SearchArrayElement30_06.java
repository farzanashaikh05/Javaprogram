package farzana;
/*
 * @Author Farzana Shaikh
 */
import java.util.Scanner;

public class SearchArrayElement30_06 {

	public static void main(String[] args) {
		//Scanner class object for user input 
		Scanner sc = new Scanner(System.in);
		
		//calling method 
		user_input_array(sc);
		
		//closing scanner Object 
		sc.close();
	}

	//method for user input Array
	private static void user_input_array(Scanner sc) {
		
		//print statement for length of Array
		System.out.println("Enter the size of Array:");
		
		int n = sc.nextInt();//variable for storing size of Array
	    int i=0;
	    int arr[] = new int[n];//declaring Array variable
	    
	    //print statement for Array elements
	    System.out.println("Enter the elements of Array: ");
	    
	    //loop for accepting Array values
	    for ( i = 0; i < n; i++) 
	    	arr[i] = sc.nextInt();
	        
	    //loop for printing Array values
	    for (i = 0; i < n; i++) 
	    	System.out.println("arr[" + i + "] = " + arr[i]);
	    
	   
	    System.out.println("enter the value for search:");
	
	    int num =sc.nextInt();//accepting value for search in an Array
	    
	    //loop for searching value in an Array
	    for(i=0;i<arr.length;i++) {
	    //condition for search	
	    if(arr[i]==num) {
	    	System.out.println(num+" is present in array.");
	    	break;
	    }	    
	    	System.out.println(num+" is not present in array.");
	    	break;
	   
	    }
	    
	    
	}
	
}

