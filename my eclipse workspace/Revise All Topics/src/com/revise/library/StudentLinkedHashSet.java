package com.revise.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//class Customized implements Comparator<StudentLinkedHashSet>
//{
//
//	@Override
//	public int compare(StudentLinkedHashSet o1, StudentLinkedHashSet o2)
//	{
//		return o2.name.length()-o1.name.length();
//	}
//	
//}
public class StudentLinkedHashSet implements Comparable<StudentLinkedHashSet>
{
	String name;
	int rollno;
	 
	public StudentLinkedHashSet(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	@Override
	public String toString()
	{
		return "name="+name+", rollno="+rollno;
	}
	
//	@Override
//	public int compare(StudentLinkedHashSet o1, StudentLinkedHashSet o2)
//	{
//		return o2.length()-o1.length();  //length based sorting
//	}
	
	@Override
	public int compareTo(StudentLinkedHashSet a) 
	{
		return this.name.compareTo(a.name);	//character based sorting
	}

	public static void main(String[] args)
	{
		StudentLinkedHashSet sl1=new StudentLinkedHashSet("sumit", 101);
		StudentLinkedHashSet sl2=new StudentLinkedHashSet("Ayush", 106);
		StudentLinkedHashSet sl3=new StudentLinkedHashSet("Rahul", 104);
		StudentLinkedHashSet sl4=new StudentLinkedHashSet("Manish", 109);
		
		LinkedHashSet<StudentLinkedHashSet> l1=new LinkedHashSet<StudentLinkedHashSet>();
		l1.add(sl1);
		l1.add(sl2);
		l1.add(sl3);
		l1.add(sl4);
		System.out.println(l1);
//		TreeSet<StudentLinkedHashSet> t1 = new TreeSet<StudentLinkedHashSet>(l1);
//		System.out.println(t1);
		ArrayList<StudentLinkedHashSet> al = new  ArrayList<StudentLinkedHashSet>(l1);
		Collections.sort(al);
		System.out.println(al);
		

	}

}
