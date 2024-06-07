//--------check and print the prime factors of a number-----//

package com.assignments.loops;

import java.util.Scanner;

public class PrimeFactors 
{
	public static void check(int n)
	{
		for(int i=1;i<=n;i++)
		{
			//if(n%i==0 && CheckPrimeSqrt.checksqrt(n)==1)
			if(n%i==0 && checksqrt(i))
			{
				System.out.println(i+" ");
			}
		}
		System.out.println();
	}
	public static boolean checksqrt(int n)
	{
		if(n==1)
		{
			return false;
		}
		else if(n==2) 
		{
			return true;
		}
		for(int i=3;i<=Math.sqrt(n);i=i+2) 
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		check(n);
	}

}
