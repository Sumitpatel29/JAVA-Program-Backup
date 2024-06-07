package com.revise.OOPS;

public class CopyConstructor
{
	String str;
	public CopyConstructor(CopyConstructor c1)
	{
		this.str=c1.str;
	}
	public CopyConstructor(String str)
	{
		this.str=str;
	}

	public static void main(String[] args) 
	{
		CopyConstructor c1=new CopyConstructor("hello");
		CopyConstructor c2= new CopyConstructor(c1);
	}

}
