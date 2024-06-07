package com.revise.library;
import java.util.*;
public class HashSet1 
{

	public static void main(String[] args)
	{
		ArrayList<Object> a1=new ArrayList<Object>();
		a1.add("hello");
		a1.add(4);
		a1.add('A');
		a1.add(4);
		a1.add(604);
		System.out.println(a1);
		
		HashSet<Object> h1=new HashSet<Object>(a1);
		System.out.println(h1);
	}
}
