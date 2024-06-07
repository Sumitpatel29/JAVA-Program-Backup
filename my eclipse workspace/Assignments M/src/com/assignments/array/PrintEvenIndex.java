package com.assignments.array;

import java.util.Scanner;

public class PrintEvenIndex 
{
	public static void printevenindex(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
		if(num[i]%2==0)
		{
			System.out.println(num[i]);
		}
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
		printevenindex(num);
		sc.close();
	}
}
