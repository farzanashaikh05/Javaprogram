package javacourse;
/*
 * @Author Farzana Shaikh
 */

public class TableOfEight {
	
    //declaring main method 
	public static void main(String[] args) {
		
		table();

	}

	private static void table() {
		int n=1,m=8;//declaring variable
		int Table;//variable for storing table 
		
		//for loop for printing table of 8
		for ( n = 1; n <=10; n++) {
			Table=m*n;//logic for table of 8
			
			//printing table 
			System.out.println(Table);
		}
	}

}
