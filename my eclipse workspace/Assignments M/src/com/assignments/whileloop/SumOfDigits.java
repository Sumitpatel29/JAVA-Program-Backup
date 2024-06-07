package com.assignments.whileloop;

import java.util.Scanner;

public class SumOfDigits
{
	public static void sumofdigits(int n)
	{
		int sum=0;
		while(n>0)
		{
			 sum += n % 10;
		     n= n/10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		sumofdigits(n);
	}
}
