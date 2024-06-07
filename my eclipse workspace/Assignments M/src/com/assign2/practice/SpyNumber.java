package com.assign2.practice;

import java.util.Scanner;

public class SpyNumber
{
	public static boolean checkspy(int n)
	{
		int sum = 0;
		int res = 1;
		int temp = n;
		while (temp != 0)
		{
			int digit = temp % 10;
			sum =sum+ digit;
			res=res * digit;
			temp=temp/10;
		}
		return sum==res;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check spy number:");
		int n=sc.nextInt();
		System.out.println(checkspy(n));
	}

}
