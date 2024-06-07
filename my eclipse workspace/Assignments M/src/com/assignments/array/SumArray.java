package com.assignments.array;

import java.util.Scanner;

public class SumArray
{
	public static void sumarray(int[] num)
	{
		int sum=0;
		for(int i=0;i<=num.length-1;i++)
		{
			sum=sum+num[i];
		}
		System.out.println(sum);
		
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
		sumarray(num);
		sc.close();
	}

}
