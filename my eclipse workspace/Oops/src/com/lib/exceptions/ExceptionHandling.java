package com.lib.exceptions;

public class ExceptionHandling 
{
	public static void test(int a)
	{
		try
		{
			int res=100/a;
			System.out.println(res);
//			int[] a1= {1,2,30};
//			System.out.println(a1[a]);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		finally
		{
			try
			{
				int[] a1= {1,2,30};
				System.out.println(a1[a]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) 
	{
		test(0);
		System.out.println("---------");
		test(1);
		System.out.println("---------");
		test(5);
		System.out.println("Continue");
	}

}
