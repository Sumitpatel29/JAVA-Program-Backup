package com.assignments.whileloop;

import java.util.Scanner;

public class LuckyNum //take input of a number and keep adding it till it goes to single digit.and that single digit is 1 then it is a lucky number
{
	public static boolean checklucky(int n)
	{
		if(n==1 && n<=9)
		{
			return true;
		}
		int sum=sumofdigits(n);
		while(sum>9)
		{
			sum=sumofdigits(sum);
		}
		if(sum==1)
		{
			return true;
		}
		return false;
	}
	public static int sumofdigits(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum=sum+ n % 10;
			n= n/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a number");
			int n=sc.nextInt();
			System.out.println(checklucky(n));
		}
	}

}
