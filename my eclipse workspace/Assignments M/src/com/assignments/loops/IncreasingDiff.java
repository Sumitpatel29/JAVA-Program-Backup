package com.assignments.loops;

import java.util.Scanner;
/*
public class IncreasingDiff 
{
	public static void increasingdiff(int n)
	{
		int x=1;
		int d=2;
		for(int i=1;i<=n;i++)
		{
			System.out.println(x);
			x=x+d;
			d++;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a number");
			int n=sc.nextInt();
			increasingdiff(n);
		}
	}

}
*/

//--------------------------------------imp-//

public class IncreasingDiff 
{
	public static void increasingdiff(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
		    sum=sum+i;
			System.out.println(sum);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter a number");
		int n=sc.nextInt();
		increasingdiff(n);
		}
	}
}

 