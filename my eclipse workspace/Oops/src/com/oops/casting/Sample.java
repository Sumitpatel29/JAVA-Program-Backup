//--------return integer----------//

package com.oops.casting;
/*
public class Sample 
{
	public static int test(int a) 
	{
		return a;
	}
	public static void main(String[] args)
	{
		System.out.println(test(5)); //both can be done
		int i1=test(10);
		System.out.println(i1);
	}
}
*/


//------------------------------------------------------------------------//


public class Sample 
{
	public static int test(int a) 
	{
		char c1='A';
		return a;
	}
	public static void main(String[] args)
	{
		//System.out.println(test(5));
		int i1=test('A');
		System.out.println(i1);
	}
}