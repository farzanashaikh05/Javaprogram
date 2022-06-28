package farzana;
/*
 * @Author Farzana Shaikh
 */

public class HCF {

	public static void main(String[] args) {
		
		hcfnum();//method calling

	}
    //private method for finding HCF
	private static void hcfnum() {
		int a,b,i;//declaring variable
		int hcf=0;//initializing hcf
		
		//declaring value for variable
		a=16;
		b=32;
		//for loop whit logical OR operator 
		for(i=1;i<=a||i<=b;i++) {
			//if condition with logical AND operator 
			if(a%i==0 && b%i==0) {
				hcf=i;//storing i value to hcf
			}
			
			
		}
		//printing HCF of two number
		System.out.println("The HCF of "+a+","+b+" is:"+hcf);
	}

}

