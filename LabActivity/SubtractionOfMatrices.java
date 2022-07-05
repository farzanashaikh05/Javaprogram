package Farzana;
/*
 * @Author Farzana Shaikh
 */
import java.util.Scanner;

public class SubtractionOfMatrices {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//creating scanner object
		System.out.println("Enter number of rows :");
		int row = sc.nextInt();//Storing number of rows
		System.out.println("Enter number of columns :");
		int col = sc.nextInt();//Storing number of columns
		
		//initialization  
		int i=0;
		int j=0;
		
		//Declaration of matrices 
		int matrix1[][] = new int[row][col];
		int matrix2[][] = new int[row][col];
		
		//matrix for storing result of subtraction 
		int sub [][]  = new int[row][col];
		
		//printing statement for first matrix
		System.out.println("Enter Elements of first matrix:");
		
		//loop for accepting the values of first matrix
		for ( i = 0; i < row; i++) 
			for ( j = 0; j < col ;j++) 
				matrix1[i][j] = sc.nextInt();
		 
		//printing statement for second matrix
		System.out.println("Enter Elements of second matrix:");
		
		//loop for accepting the values of second matrix
		for ( i = 0; i < row; i++) 
			for ( j = 0; j < col; j++) 
				matrix2[i][j] = sc.nextInt();
		
		//Displaying the first matrix
		System.out.println("first matrix is :");
		for ( i = 0; i < row; i++) 
			for ( j = 0; j < col; j++) 
				System.out.println("arr1[" + i + j+"] = " + matrix1[i][j]);
		
		//Displaying the second matrix
		System.out.println("second matrix is :");
		for ( i = 0; i < row; i++) 
			for ( j = 0; j < col; j++)
				System.out.println("arr2[" + i + j+"] = " + matrix2[i][j]);
				
		 
		//Subtraction of matrices 
		for ( i = 0; i < row; i++) 
			for ( j = 0; j < col; j++)  
			    sub[i][j]=matrix1[i][j]-matrix2[i][j]; //Subtraction 
		
		
		//Printing the Subtraction of matrices 
		System.out.println("Subtraction of matrices is:");
		for ( i = 0; i < row; i++) 
			for ( j = 0; j < col; j++) 
				System.out.println(sub[i][j]+" ");
		}
	}

