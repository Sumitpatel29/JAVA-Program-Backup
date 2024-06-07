package com.revise.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

 class Student
{
	String name;
	int id;
	public Student(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString()
	{
		return "name="+ name+" id="+id;
	}
//	@Override
//	public int compare(String s1,String s2)
//	{
//		return s1.name.compareTo(s1);
//	}
}
	public class ArrayList1  
	{
	public static void main(String[] args)
	{
		Student s1=new Student("Sumit",101);
		Student s2=new Student("Ayush",102);
		Student s3=new Student("Manish",106);
		Student s4=new Student("Rahul",109);
		
		ArrayList<Student> stdlist=new ArrayList<Student>();
		stdlist.add(s1);
		stdlist.add(s2);
		stdlist.add(s3);
		stdlist.add(s4);
//		Collections.sort(stdlist);
		System.out.println(stdlist); //it will preserve insertion order
		//fetch data using iterator
		Iterator<Student> it= stdlist.iterator();
		while(it.hasNext())
		{
			Student data=it.next();
			System.out.println(data);
		}
//		Collections.sort(stdlist,new Student);
	}
}
