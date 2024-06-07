package com.lib.array;
import java.util.ArrayList;
import java.util.Iterator;;

public class ArrayListExample
{	
	public static void main(String[] args) 
	{
		ArrayList<Object> alist = new ArrayList<Object>();
		//add elements to arrayList use add method
		alist.add(10);
		alist.add(10);
		alist.add('A');
		alist.add(null);
		alist.add("hello");
		alist.add(null);
		System.out.println(alist);
		System.out.println("traverse the elements from the arrayList 2nd element");
		System.out.println(alist.get(2));
		System.out.println("--------traverse all the elements from the arrayList using for loop");
		for (int i = 0; i < alist.size(); i++) 
		{
			System.out.println(alist.get(i));
		}
		System.out.println("--------traverse all the elements from the arrayList using foreach loop");
		for(Object obj:alist)
		{
			System.out.println(obj);
		}
		System.out.println("--------traverse all the elements from the arrayList using iterator loop");
		Iterator<Object> i1=alist.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("-----traverse all the elements from the arrayList using forEach()"); 
		alist.forEach(obj -> System.out.println(obj));
	}

}
