//Calculate sum of factors & return true if sum is even else false//

package com.assignments.loops;

import java.util.Scanner;

public class SumOFfactors 
{
	public static boolean sumoffactors(int n)
	{
		int sum=0;

		for(int i=1;i<=n;i++)			//
		{								//
			if(n%i==0)					// print sum of factors
			{							//
				sum=sum+i;				//
			}							//
		}
		if(sum%2==0)					// checking if the sum of factors is prime or not
		{
			return true;
		}
		return false;
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		System.out.println(sumoffactors(n));
	}
}
