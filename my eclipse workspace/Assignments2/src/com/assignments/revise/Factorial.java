package com.assignments.revise;


import java.math.BigInteger;
import java.util.Scanner;
public class Factorial {
	public static String factorial(long n)
		{
			BigInteger res=BigInteger.ONE;
			for (long i = n; i >=1; i--) 
			{
				res=res.multiply(BigInteger.valueOf(i));
			}
			return res.toString();
		}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			while(true)
			{
				System.out.println("Enter a number:");
				long n=sc.nextLong();
				System.out.println(factorial(n));
			}
		}

	}


