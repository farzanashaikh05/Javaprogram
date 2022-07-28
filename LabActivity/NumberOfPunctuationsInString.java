package Farzana;
/*
 * @Author Farzana Shaikh
 */

//create a Java program that counts the total number of punctuations in a given string.
//Steps to Count the Punctuations
//•	Define a string or read from the user.
//•	Declare a variable to count the number of punctuations and initialized it with 0.
//•	Now, match each and every character with the punctuation marks (!, . , ' , - , " , ? , ; ). If any character in the string is matched with any of the punctuation marks, increment the count variable by 1.
//•	At last, print the count variable that gives the total number of punctuations.
//•	Let's implement the above steps in a Java program.
public class NumberOfPunctuationsInString {

	public static void main(String[] args) {
		
		punctuations();//calling method
		

	}

	private static void punctuations() {
		String s= "He said, 'The smallest dog barks the loudest.' I heard it with my own ears.";
		int count=0;//variable for counting number of punctuations in string
		System.out.println(s);//Printing Strings 
		
		for (int i = 0; i < s.length(); i++) {
			
			//condition for checking Punctuation in the string
			if(s.charAt(i)=='!' || s.charAt(i)==',' ||s.charAt(i)=='.' ||s.charAt(i)=='-' 
					||s.charAt(i)=='"' ||s.charAt(i)=='?' ||s.charAt(i)==';'||s.charAt(i)=='\''
					||s.charAt(i)=='\"') 
			{
				count++;
				
		}
			
			
		}
		//displaying numbers of punctuations 
		System.out.println("\nThe number of punctuations exists in the string is: "+count);
	}

}
