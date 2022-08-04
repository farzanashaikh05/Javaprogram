package Farzana;
/*
 * @Author Farzana Shaikh
 */

//1. Program to print the largest element in an array

import java.util.Scanner;

public class LargestNumberInArray04Aug {
	
	public static void main(String args[]) {
		
		largest();//method calling 
	}
	
	private static void largest() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size=sc.nextInt();//user input size
		
		int arr[]=new int[size];
		System.out.println("Enter the element in an Array:");
		for (int i = 0; i < size; i++) 
		{
			arr[i]=sc.nextInt();//user input Array
		}
		int max = arr[0]; //Variable for comparing 
		
         
        for (int i = 0; i < size; i++) {  
              
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("largest element in an array is:"+max);
	}

}
