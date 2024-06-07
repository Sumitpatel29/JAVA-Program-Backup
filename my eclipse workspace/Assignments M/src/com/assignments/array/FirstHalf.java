package com.assignments.array;

import java.util.Scanner;

public class FirstHalf 
{
	public static void printfirsthalf(int[] num)
	{
		for(int i=0;i<=(num.length-1)/2;i++)
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
		printfirsthalf(num);
		sc.close();

	}

}
