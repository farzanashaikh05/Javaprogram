package Farzana;
/*
 * @Author Farzana Shaikh
 */

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {

		transpose();//method calling 


	}
	//method for finding transpose of matrix
	private static void transpose() {
		
		Scanner sc = new Scanner(System.in);//Scanner object
		
		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();//variable for storing row value
		System.out.println("Enter the number of columns:");
		int cols=sc.nextInt();//variable for storing column value
		
		
		int matrix[][]=new int[rows][cols];//matrix declaration
		
		int transpose[][]=new int[cols][rows];//declaring transpose matrix for storing transpose of a matrix
		
		
		//for loop for Accepting values for matrix
		System.out.println("Enter values for matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		//for loop for printing matrix
		System.out.println("Original matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j]+" ");
			}System.out.println();
		}
		
		//for loop for transpose of a matrix 
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i]=matrix[i][j];
			}
		}
		
		//Displaying the transpose of matrix
		System.out.println("transpose of a matrix");
		for (int i = 0; i < cols; i++) {//converting rows into columns
			for (int j = 0; j < rows; j++) {//converting columns into rows
				System.out.print(transpose[i][j]+" ");//printing transpose of matrix
			}System.out.println();
		}
		sc.close();//colsing scanner object
	}

}
