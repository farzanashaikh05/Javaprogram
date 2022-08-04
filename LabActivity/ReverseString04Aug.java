package Farzana;
/*
 * @Author Farzana Shaikh
 */

//3. Reserve a string in Java without using reverse function
public class ReverseString04Aug {

	public static void main(String[] args) {
		reverse();

	}

	private static void reverse() {
		String str="Today is Lab Day";
		System.out.println("Original String is:\n"+str);
		
		System.out.println("\nReverse String is:");
		//loop for printing reverse of a string 
		for (int i = str.length(); i > 0; --i) {
			System.out.print(str.charAt(i-1));//i-1 for last index value 
			
		}
	}

}
