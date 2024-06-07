/*Write a program that reads a set of integers, and then prints the sum of the even and odd integers.*/

package com.assignments.loops;

import java.util.Scanner;
/*
public class SumOfEvenOdd 
{
	public static void sumofevenodd(int n)
	{
		int even=0;
		int odd=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				even=even+i;
			}
			else
			{
				odd=odd+i;
			}
		}
		System.out.println("Even Sum \n" +even);
		System.out.println("Odd sum\n"+odd);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your range:");
		int n=sc.nextInt();
		sumofevenodd(n);
	}

}
*/
//---------if starting and is unknown---------------//

public class SumOfEvenOdd 
{
	public static void sumofevenodd(int start,int end)
	{
		int even=0;
		int odd=0;
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				even=even+i;
			}
			else
			{
				odd=odd+i;
			}
		}
		System.out.println("Even Sum \n" +even);
		System.out.println("Odd sum\n"+odd);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your starting number:");
		int start=sc.nextInt();
		System.out.println("Enter your ending number:");
		int end=sc.nextInt();
		sumofevenodd(start,end);
	}

}
