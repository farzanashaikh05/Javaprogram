package Farzana;
/*
 * @Author Farzana Shaikh
 */

public class StringVowels {
	public static void main(String[] args) {
		vowels();

	}

	private static void vowels() {
		String s= "I am Farzana Shaikh";
		int cnt=0;
		System.out.println(s);//Printing the String
		
		//for loop for counting vowels in a String 
		for (int i = 0; i < s.length(); i++) {
			
			//Condition for checking Vowels 
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
				s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				
				//
				cnt++;//incrementing count for counting number of Vowels 
				
			}
			
		}
		//Printing numbers of vowels in a String 
		System.out.println("\nNumber of Vowels is:"+cnt);
	}

}
