package com.assignments.loops;

import java.util.Scanner;

public class NonPrime 
{
	public static void nonprime(int n)
	{
		for(int i=2;i<=n;i++)
		{
			int res=i*i;
			System.out.println(res);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		nonprime(n);
	}
}
