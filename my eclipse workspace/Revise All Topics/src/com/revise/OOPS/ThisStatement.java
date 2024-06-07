package com.revise.OOPS;
class ThisStatement 
{
	public ThisStatement()
	{
		System.out.println("This statement()");
	}
	public ThisStatement(int a)
	{
		this();
		System.out.println("This statement (int)");
	}
	public ThisStatement(String str)
	{
		this(5);
		System.out.println("This statement (String)");
	}

	public static void main(String[] args) 
	{
		ThisStatement ts1= new ThisStatement("hello");
	}

}
