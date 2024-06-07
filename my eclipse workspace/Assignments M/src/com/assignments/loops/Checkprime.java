package com.assignments.loops;

import java.util.Scanner;

public class Checkprime 
{

/*
	public static boolean check(int n)
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

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 while(true)
	 {
	 System.out.println("Enter a number :");
	 int n=sc.nextInt();
	 System.out.println(check(n));
	 }
	}

}
 */
//----------------Logic 2 (Without extra variable)------------//

	public static boolean check(int n) //O(N) big oh notation of N
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
		while(true)
		{
			System.out.println("Enter a number :");
			int n=sc.nextInt();
			System.out.println(check(n));
		}
	}
}
//-----------------------------------------------------------------//
/*

}
*/