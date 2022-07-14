package Farzana;
import java.util.Scanner;
/*
 * @Author Farzana Shaikh
 */
//1.	Declare a class Student.
//Declare the attributes of the student class as below.
//	Name
//	Id
//	Gender
//	Standard
//Set the values of the attributes from the user and display it to the end user.

//Student class for setter and getter method
class Student{
	Scanner sc=new Scanner(System.in);
	//defining private instant variables
	private int id;
	private String name,gender;
	private String Standard;
	//setting id,name and course
	public void setid(){ 
		System.out.println("enter id:");
		id=sc.nextInt();
	}
	public void setname()	{
		System.out.println("enter name:");
		name=sc.next();
		
	}
	public void setgender() {
		System.out.println("enter gender:");
		gender=sc.next();
	}
	public void setstandard() {
		System.out.println("enter standard:");
		Standard=sc.next();
		
	}
	//Returning id,name and method
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public String getgender() {
		return gender;
	}
	public String getstandard() {
		return Standard;
		
	}
}	
	
public class StudentDisplay{
	public static void main(String[] args) {
		//creating object of student class
		Student st = new Student();
		//method calling
		st.setid();
		st.setname();
		st.setgender();
		st.setstandard();
		
		//printing the values 
		System.out.println("Student id is:"+st.getid());
		System.out.println("Student name is:"+st.getname());
		System.out.println("Student gender is:"+st.getgender());	
		System.out.println("Student standard is:"+st.getstandard());

	}
}
