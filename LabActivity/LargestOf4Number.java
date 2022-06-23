package javacourse;
/*
 * @Author Farzana Shaikh
 */

public class LargestOf4Number {

	public static void main(String[] args) {
		greaterof4num();//method calling
			
		

	}
	
    //define method for finding largest number
	private static void greaterof4num() {
		
		int a=10,b=43,c=1,d=8; //declaring the Numbers
		
		//conditions for finding the greater number and Printing the greater number
		if(a>b && a>c && a>d)
			System.out.println("a="+a+" is greater");
		else if(b>a && b>c && b>d) 
			System.out.println("b="+b+" is greater");
		else if(c>a && c>b && c>d)
			System.out.println("c="+c+" is greater");
		else
			System.out.println("d="+d+" is greater");
	}

}
