package com.assignments.rotation;

import java.util.Scanner;

public class CircularPrime 
{
	public static boolean checkprime(int n)
	{
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static boolean isCircular(int n)
	{
		int copy=n,fnum,lnum,digit=0;
		while(copy>0)
		{
			copy=copy/10;
			digit++;
		}
		int a = n;
		while(checkprime(a))
		{
			fnum=a%10;
			lnum=a/10;
			a=(int) ((Math.pow(10, digit-1)*lnum)+fnum);
			if(a==n)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check circularprime:");
		int n=sc.nextInt();
	
		if(isCircular(n))
		{
			System.out.println("Circular prime"+n);
		}
		else
		{
			System.out.println("Not Circular prime");
		}

	}

}


