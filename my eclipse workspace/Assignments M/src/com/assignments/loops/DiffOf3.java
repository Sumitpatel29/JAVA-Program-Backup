package com.assignments.loops;

import java.util.Scanner;

public class DiffOf3 
{
	public static void printnum(int n)
	{
		for(int i=1;i<=n;i=i+3)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter a number");
		int n=sc.nextInt();
		printnum(n);
		}
	}

}
