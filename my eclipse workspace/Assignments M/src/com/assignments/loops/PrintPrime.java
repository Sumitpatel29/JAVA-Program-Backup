//print prime numbers upto n 

package com.assignments.loops;

import java.util.Scanner;

public class PrintPrime 
{
	public static void printprime(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(checkprime(i))
			{
				System.out.println("i="+i);
			}
		}
	}
	public static boolean checkprime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<=n-1;i++)
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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nth number:");
		int n=sc.nextInt();
		printprime(n);

	}
}
