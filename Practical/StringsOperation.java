package Farzana;

/*
 * @Author Farzana Shaikh
 */

//Problem Statement 1:
//Write a program which creates a String “Welcome to Java World” and performs the following 
//•	Returns the character at 5th position and display it.
//•	Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
//•	Concatenates “- Let us learn” to the above string and display it.
//•	Returns the position of the first occurrence of character ‘a’ and display it.
//•	Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
//•	Returns string between 4th position and 10th position and display it.
//•	Returns the lowercase of the string and display it.

public class StringsOperation {

	public static void main(String[] args) {
		stringOp();

	}

	private static void stringOp() {
		String str="Welcome to Java World";
		System.out.println("character at 5th position is: "+str.charAt(5));
		
		
		System.out.println("\nConcatenates string is:\n"+str.concat(" Let us learn"));
		System.out.println("\nposition of the first occurrence of character 'a' is: "+str.indexOf("a"));
		System.out.println("\nReplaces all the occurrences of 'a' character with the new 'e' :\n"+str.replace("a","e"));	
		System.out.println("\nstring between 4th position and 10th position is:\n"+str.substring(4,10));		
		System.out.println("\nlowercase of the string is: "+str.toLowerCase());
		
	}

}
