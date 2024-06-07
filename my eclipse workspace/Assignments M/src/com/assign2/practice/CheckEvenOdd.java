package com.assign2.practice;

import java.util.Scanner;

public class CheckEvenOdd
{
	public static void check(int n) //Without using IF condition
	{
		int res=n%2;
		switch(res)
		{
		case 0:	System.out.println("even"); break;
		default:System.out.println("odd");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check even or odd");
		int n=sc.nextInt();
		check(n);
	}

}
