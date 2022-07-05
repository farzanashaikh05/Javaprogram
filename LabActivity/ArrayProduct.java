package Farzana;
/*
 * @Author Farzana Shaikh
 */
import java.util.Scanner;

public class ArrayProduct {

	public static void main(String[] args) {	
	
		//Scanner class object for user input 
	    Scanner sc = new Scanner(System.in);
				
        System.out.println("Enter the size of Array:");       	
		int n = sc.nextInt();//variable for storing size of Array
		
	    int i=0;
	    //declaring Array variable
	    int arr1[] = new int[n];
	    int arr2[] = new int[n];
	    
	    //array for storing product of two arrays
	    int product[]=new int[n];
	    //print statement for Array elements
	    System.out.println("Enter the elements of 1st Array: ");
	    
	    //loop for accepting Array values
	    for ( i = 0; i < n; i++) 
	    	arr1[i] = sc.nextInt();
	        
        System.out.println("Enter the elements of 2nd Array: ");
	    
	    //loop for accepting Array values
	    for ( i = 0; i < n; i++) 
	    	arr2[i] = sc.nextInt();
	    
	    //loop for printing Array values
	    System.out.println("Element of first array :");
	    for (i = 0; i < n; i++) 
	    	System.out.println("arr1[" + i + "] = " + arr1[i]);
	    
	    System.out.println("Element of second array :");
	    for (i = 0; i < n; i++) 
	    	System.out.println("arr2[" + i + "] = " + arr2[i]);
	    
	    //array multiplication 
	    for (i = 0; i < n; i++) 
	    	product[i] = arr1[i] * arr2[i];
	    	
	    //printing product of two arrays
	    for (i = 0; i < n; i++) {
	    	System.out.println("product of two arrays is: "+product[i]);
	    }
	    	
	    
	    	
	 }
}
