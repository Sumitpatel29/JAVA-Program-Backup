/*Two numbers are entered through keyboard .Write a program to find the value of one number raised to the power of another (Dont use
 java built in method)
 */

package com.assignments.loops;

import java.util.Scanner;

public class PowerofNum 
{
	public static long pow(int b,int p)
	{
		long res=1l;
		for(int i=1;i<=p;i++)
		{
			res=res*b;
		}
		return res;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter base b:");
			int b=sc.nextInt();
			System.out.println("Enter power p:");
			int p=sc.nextInt();
			System.out.println(pow(b, p));
		}
	}
}
