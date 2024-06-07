package com.assignments.revise;

import java.util.Scanner;
import java.math.*;

public class AdditionWithBigInteger
{
	public static BigInteger add(long a,long b)
	{
		BigInteger b1=new BigInteger(a+"");
		BigInteger b2=BigInteger.valueOf(b);
		return b1.add(b2);
	}
	public static BigInteger add2(long a,long b)
	{
		BigInteger b1=BigInteger.valueOf(a);
		BigInteger b2=BigInteger.valueOf(b);
		return b1.add(b2);
	}

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first  number:");
		long a=sc.nextLong();
		System.out.println("Enter Second  number:");
		long b=sc.nextLong();
		//System.out.println(add(a, b));
		System.out.println(add2(a, b));
		sc.close();		
	}

}
