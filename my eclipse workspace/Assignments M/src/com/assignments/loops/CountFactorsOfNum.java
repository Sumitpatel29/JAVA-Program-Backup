/*wap to check if a number is prime or not.
A number only divisible by 1 and itself is called as prime number 
ex:5,7,13,101,1193 etc.*/

package com.assignments.loops;

import java.util.Scanner;
/*
public class CountFactorsOfNum 
{
	public static int countfactors(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		System.out.println(countfactors(n));

	}

}
 */

/*---wap to check if a number is prime or not.
A number only divisible by 1 and itself is called as prime number 
ex:5,7,13,101,1193 etc.

A) using count variable /count factor approach .-----*/


public class CountFactorsOfNum 
{
	public static int countfactors(int n)//counting the number of factors of a number
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return count;
	}
	public static boolean checkprime(int n)  //checking the number of factors is prime or not
	{
		int count=0;
		for(int i=2;i<=n/2;i++)  //we can use i<=n/2 to reduce time complexity
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(n>=2 && count==0)    //n must be <=2 because in 
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		System.out.println(countfactors(n));
		System.out.println(checkprime(n));
	}
}

