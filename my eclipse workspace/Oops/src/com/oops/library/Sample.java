package com.oops.library;

public class Sample 
{
	@Override
	public int hashCode()
	{
		return 400;
	}
	@Override
	public String toString()
	{
		return "Overridden String";
	}
	@Override
	public boolean equals(Object obj)
	{
		return true;	
	}
	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		Sample s2=new Sample();
		System.out.println("--------hashCode()---------");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("--------toString()---------");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println("--------equals()---------");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
		
	}

}
