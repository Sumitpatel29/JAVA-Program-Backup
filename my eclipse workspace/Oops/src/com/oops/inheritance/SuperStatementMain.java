package com.oops.inheritance;
class Sample10
{
	public Sample10(int a)
	{
		super();
		System.out.println("Sample Class Constructor");
	}
}
class Demo10 extends Sample10
{
	public Demo10(int a)
	{
		super(a);
		System.out.println("Demo class Constructor");
	}
}
public class SuperStatementMain 
{
	public static void main(String[] args) 
	{
		Demo10 d1=new Demo10(56);	
	}
}
