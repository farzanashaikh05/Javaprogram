package Farzana;
/*
 * @Author Farzana Shaikh
 */
public class AreaUsingObject {
	int l;
	int b;
	int area;
	

	public static void main(String[] args) {
		
		CalculateArea();//method calling
		
	}
	
	//method for calculating Area
	private static void CalculateArea() {
		AreaUsingObject ar = new AreaUsingObject();
		ar.l=12;
		ar.b=6;
		ar.area=ar.l*ar.b;
		
		
		System.out.println("Area is:"+ar.area);
	}

}
