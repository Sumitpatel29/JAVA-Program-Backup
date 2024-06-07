package com.assignments.loops;

import java.util.Scanner;

public class Factorial 
{
	public static void factorial(int n) 
	{
		long res=1L;		      /*if we take int as variable instead of long.then it will give correct result upto only 12 .
							       AFTER 12 it will start giving false result*/
		for(int i=n;i>=1;i--)
		{
			res=res*i;
		}
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter a number to calculate Factorial: ");
		int n=sc.nextInt();
		factorial(n);
		}
	}
}

//-------------LOGIC 2-------------//
/*
public class Factorial 
{
	public static void factorial(int n)
	{
		long res=1L;
		for(int i=1;i<=n;i++)
		{
			res=res*i;
		}
		System.out.println(res);
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to calculate Factorial: ");
	int n=sc.nextInt();
	factorial(n);
}
}
 */
//------------USING RETURN TYPE------------//
/*
public class Factorial 
{
	public static BigInteger factorial(int n)
	{
		BigInteger res=1;
		for(int i=n;i>=1;i--)
		{
			res=res*i;
		}
		return res;
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to calculate Factorial: ");
	int n=sc.nextInt();
	factorial(n);
}
}
 */