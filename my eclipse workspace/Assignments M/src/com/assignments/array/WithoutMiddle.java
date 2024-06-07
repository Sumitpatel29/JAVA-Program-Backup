package com.assignments.array;

import java.util.Scanner;

public class WithoutMiddle //print array excluding middle elements
{
	public static void exceptmiddle(int[] num)
	{
		for (int i = 0; i<=(num.length-1)/2-1; i++) 
		{
			System.out.print(num[i]+" ");
		}
		for (int i = (num.length-1)/2+1; i<=num.length-1; i++) 
		{
			System.out.print(num[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers into the array:");
		int[] num=new int[10];
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		exceptmiddle(num);
	}
}
