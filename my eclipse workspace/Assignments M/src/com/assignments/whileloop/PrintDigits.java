package com.assignments.whileloop;

import java.util.Scanner;

public class PrintDigits 
{
	public static void check(int n)
	{
		while(n>0)
		{
			int remainder=n%10;
			System.out.println(remainder);
			n=n/10;
		}
	}
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		check(n);
	}

}
