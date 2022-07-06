//Developers need to develop a tax calculator for calculating tax using
//arithmetic, relational and logical operators.
//Problem Statement 1: Declaring instance variables.
//Develop a class “TaxCalculator” inside a package “com.cognizant.tax”. The class
//should have an instance float variable named “basicSalary” and a boolean variable
//named “citizenship”.
//Problem Statement 2: Usage of Arithmetic operators.
//In the TaxCalculator class create a method named calculateTax() that should
//calculate and print the tax, the tax should be calculated as follows
//tax = 30*basic salary/100
//NOTE: The value stored in the instance variable” basicSalary” should be used in the
//above calculation.
//The calculated tax needs to be stored in another instance float variable “tax”.
//This method will display the following message in the console.
//“The Tax of the employee for the <basic Salary> is <tax>”
package com.cognizant.tax;

public class TaxCalculator {
	
	float basicSalary;
	boolean citizenship;
	
	public static void main(String[] args) {
		
		TaxCalculator tc = new TaxCalculator();
		
		tc.basicSalary=30000;		
		tc.calculateTax();
	}
	
	public void calculateTax() {
		
		float tax = 30*basicSalary/100;	
	
		System.out.println("The Tax of the employee for the basic Salary = "+basicSalary+ " is "+tax);
	}

}
