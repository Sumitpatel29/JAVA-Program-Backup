package com.assignments.whileloop;

import java.util.Scanner;

public class PalindromeNumber
{
	public static boolean palindrome(int n)
	{
		int temp=n;
		int reverse=0;
		while (temp>0)									//using code of reverse a number
		{
			int remainder=temp%10;
			reverse=reverse*10+remainder;
			temp=temp/10;
		}												//till here
		if(reverse==n)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println(palindrome(n));
	}

}

