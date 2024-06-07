package com.assignments.loops;

import java.util.Scanner;

public class NprimeNum
{
	public static void print(int s,int n)
	{
		int p=0;
		for(int i=s;;i++)
		{
			if(checkprime(i))
			{
				System.out.println("i = "+i);
				p++;
			}
			if(p==n)
			{
				break;
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
		System.out.println("Enter starting number: ");
		int start=sc.nextInt();
		System.out.println("Enter how many prime number you want: ");
		int n=sc.nextInt();
		print(10,5);
	}

}
