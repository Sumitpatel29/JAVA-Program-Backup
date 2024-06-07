//Print factors excluding 1 and the number itself//
package com.assignments.loops;

import java.util.Scanner;

public class PrintFactors 
{
	public static void printfactors(int n)
	{
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				System.out.println(i); 
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		printfactors(n);
	}
}
