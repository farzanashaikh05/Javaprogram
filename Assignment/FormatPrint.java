//Problem Statement # 2:
//Develop a program to print the following format 
//
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2 
//1
//Hint:  Use nested for loops to achieve this

package com.cognizant.tax;

public class FormatPrint {
	

	public static void main(String[] args) {
		int i,j;
		int rows=6;
		for ( i = 1; i <=rows; i++) {
			
			for ( j = 1; j<=i ; j++) {
				
					System.out.print(j+" ");
			}
			System.out.println("");
			
			
		}
	    for ( i = rows; i >=1; i--) {
	    				
			for ( j = 1; j<=i-1 ; j++) {
				
					System.out.print(j+" ");
			}
			System.out.println("");
			
			
		}
		
	

	}
}
