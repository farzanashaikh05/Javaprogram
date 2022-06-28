package farzana;
/*
 * @Author Farzana Shaikh
 */

public class CopyArray {

	public static void main(String[] args) {
		copyofarray();

	}

	private static void copyofarray() {
		//initialize array
		int i;
		
		//create an array arr1
		int arr1[]= {10,20,30,40,50};
		
		// Create an array arr2[] of same size as arr1[]
		int arr2[]=new int [arr1.length];
		
		arr2=arr1;//copy the arr1 to arr2
		
		System.out.println("arr2 :");
		
		//for loop for iterating the index value 
		for(i=0;i<arr1.length;i++) {	
			
			
			//printing the arr2
			System.out.print(arr2[i]+" ");			
			
		}
	}
}