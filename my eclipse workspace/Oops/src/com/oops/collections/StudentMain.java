package com.oops.collections;
import java.util.ArrayList;
class Student 
{
	String name;
	int id;
	double marks;
	public Student(String name,int id,double marks)
	{
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	@Override
	public String toString() 
	{
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}
	
	//customized sorting
//	@Override
//	public int compareTo(Student o1,Student o2)
//	{
//		return o2-o1;
//	}

}
public class StudentMain 
{
	public static void main(String[] args) 
	{
		//create Student objects
		Student s1=new Student("sumit",101,78.4);
		Student s2=new Student("Kishore",102,35.0);
		Student s3=new Student("kumar",104,69.0);
		Student s4=new Student("ayush",103,58.4);
		
		//create arraylist and add elements
		ArrayList<Student> stdList=new ArrayList<Student>();
		stdList.add(s4);
		stdList.add(s3);
		stdList.add(s1);
		stdList.add(s2);
		
		//fetching elements
		System.out.println(stdList);
		stdList.forEach(obj -> System.out.println(obj));
	}

}
