package com.revise.library;

public class Sample {
	
@Override
public int hashCode()
{
	return 200;
}
@Override
public String toString()
{
	return "Hello";
}

	public static void main(String[] args) 
	{
		
		Sample s1=new Sample();
		Sample s2=new Sample();
		
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));

	}

}
