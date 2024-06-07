package com.assignments.array;

import java.util.Scanner;

public class SecondHalf 
{
	public static void printsecondhalf(int[] num)
	{
		for(int i=(num.length-1)/2;i<=num.length-1;i++)
		{
			System.out.println(num[i]);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers into the array:");
		int[] num=new int[5];
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		printsecondhalf(num);
		sc.close();
	}
}
