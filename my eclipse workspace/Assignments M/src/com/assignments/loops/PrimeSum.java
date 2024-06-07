/*Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number. */

package com.assignments.loops;

import java.util.Scanner;

public class PrimeSum 
{
	public static void sumprime(int n)
	{
		int sum=0;
	for(int i=2;i<=n;i++)
	{
		if(i%2==0)
		{
			sum=sum+i;
		}
	}
	System.out.println("sum of prime numbers:"+sum);
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your range:");
	int n=sc.nextInt();
	sumprime(n);
}
}


//---------if starting and ending is unknown----------//
/*
public class PrimeSum 
{
	public static void sumprime(int start,int end)
	{
		int sum=0;
	for(int i=start;i<=end;i++)
	{
		if(i%2==0)
		{
			sum=sum+i;
		}
	}
	System.out.println("sum of prime numbers:"+sum);
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your starting number:");
	int start=sc.nextInt();
	System.out.println("Enter your ending number:");
	int end=sc.nextInt();
	sumprime(start,end);
}
}
*/