package Farzana;

//2. Java Program to count the total number of characters in a string
public class CharactersInString {

	public static void main(String[] args) {
		
		countchar();
	
	}

	private static void countchar() {
		String str="Shaikh Farzana ";

		System.out.println(str);
		str=str.replace(" ", "");
		System.out.println("Characters in a String is :"+str.length());
	}

}
