package Farzana;
/*
 * @Author Farzana Shaikh
 */

class Employee{
	int id;
	String name;
	
}
public class CustomClass {

	public static void main(String[] args) {
		Employee far = new Employee();
		Employee suf = new Employee();
		
		far.id=21;
	    far.name= "Farzana" ;
		
		
		suf.id=31;
		suf.name="Sufiya"; 
		
		System.out.println("Employee id :"+far.id+", Employee name :"+far.name);
		System.out.println("Employee id :"+suf.id+", Employee name :"+suf.name);
		
		

	}

}
