package com.cognizant.tax;

import java.util.Scanner;

public class ScannerLaptopDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option=0;
		int n1,n2;
		int result=0;		
		
		do {
			System.out.println("enter Option \n Add-1 \n Subtract-2 \n Multiply-3 \n quit-4");		
		    option = sc.nextInt();
			
			
			switch(option) {
								
			case 1:
				System.out.println("Enter two numbers to be added");
			    n1=sc.nextInt();
			    n2=sc.nextInt();
			    result=n1+n2;
			    System.out.println("The result is :"+result);
			break;
			case 2:
				System.out.println("Enter two numbers to be subtracted");
			    n1=sc.nextInt();
			    n2=sc.nextInt();
			    result=n1-n2;
			    System.out.println("The result is :"+result);
			break;
			case 3:
				System.out.println("Enter two numbers to be multiplied");
			    n1=sc.nextInt();
			    n2=sc.nextInt();
			    result=n1*n2;
			    System.out.println("The result is :"+result);
			break;
			
			default:
				System.out.println("Enter valid Option");
		    break;
			    
			}
		}
		while(option != 4);
		{
			System.out.println("Quit");
			
		}


}
}
