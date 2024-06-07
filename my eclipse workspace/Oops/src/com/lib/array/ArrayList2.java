package com.lib.array;
import java.util.ArrayList;
public class ArrayList2 {

	public static void main(String[] args) 
	{
		ArrayList<Object> alist = new ArrayList<Object>();
		alist.add(1);
		alist.add("java");
		System.out.println(alist);
		
		alist.add(1,"hello");
		System.out.println(alist);
		
		ArrayList<Object> alist1=new ArrayList<Object>();
		alist1.add(5);
		alist1.add('z');
		System.out.println(alist1);
		
		alist1.addAll(alist);
		System.out.println(alist);
		
		alist.addAll(1,alist);
		System.out.println(alist1);
		
		alist1.remove(1);
		alist1.remove("hello");
		System.out.println(alist1);
		
		alist1.removeAll(alist1);
		alist.clear();
		
		System.out.println(alist.contains("hello"));
		System.out.println(alist.containsAll(alist));
		
		
	}

}
