//with best time complexity//

package com.assignments.loops;

import java.util.Scanner;

public class CheckPrimeSqrt 
{
	public static int checksqrt(int n)
	{
		if(n==1)
		{
			return 0;
		}
		else if(n==2 || n==3)
		{
			return 1;
		}
		for(int i=5;i<=Math.sqrt(n);i=i+2) 
		{
			if(n%i==0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		System.out.println(checksqrt(n));
	}

}
