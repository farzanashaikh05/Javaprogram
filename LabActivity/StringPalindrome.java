package Farzana;
/*
 * @Author Farzana Shaikh
 */
public class StringPalindrome {
	public static void main(String args[]) {
		palindrome();//method calling
		
	}

	private static void palindrome() {
		StringBuffer sb= new StringBuffer("farzana");
		String c=sb.toString();//converting StringBuffer to String
		
		sb.reverse();//Reverse the String
		
		//Condition for Checking Palindrome 
		if(c.contentEquals(sb)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
	}
