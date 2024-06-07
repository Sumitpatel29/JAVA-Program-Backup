package com.revise.OOPS; 
/* to make class as JAVA Bean Class .
   Implementing serializable,decalring data members as private and access through public getter and setter method. 
 */
import java.io.Serializable;//implemented serializable

 public class Student implements Serializable
{
	private String  name;	//declaring data members as private
	private int id;
	private double marks;
	
	public String getName()		//using public getter method to get output
	{
		return name;
	}
	public void setName(String name)		//using public setter method to update values.Return type of setter is always void type.
	{
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public double getMarks()
	{
		return marks;
	}
	public void setMarks(double marks)
	{
		this.marks=marks;
	}
}
 class StudentMain
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.setName("sumit");
		System.out.println(s1.getName());
		s1.setMarks(86.0);
		System.out.println(s1.getMarks());
		s1.setId(001);
		System.out.println(s1.getId());

	}

}
