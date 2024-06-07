package com.lib.exceptions;

public class Sample
{
	public static void test(int a)
	{
		try
		{
		int res=1000/a;
		System.out.println(res);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();  //print the error that was JVM printing previously but it is done by the programmer
		}
	}

	public static void main(String[] args)
	{
		test(1);
		test(0);
		System.out.println("Hello");
		

	}

}
