package com.assignments.whileloop;

import java.util.Scanner;

public class PrintEvens 
{
	public static void checkevens(int n)
	{
		while(n>0)
		{
			int remainder=n%10;
			if(n%2==0)
			{
			System.out.println(remainder);
			n=n/10;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		checkevens(n);
	}

}
