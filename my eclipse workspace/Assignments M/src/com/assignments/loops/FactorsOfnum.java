//get factors of a number//

package com.assignments.loops;

import java.util.Scanner;

public class FactorsOfnum 
{
public static void getfactors(int n)
{
	for(int i=1;i<=n;i++)
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
		getfactors(n);
	}
}
