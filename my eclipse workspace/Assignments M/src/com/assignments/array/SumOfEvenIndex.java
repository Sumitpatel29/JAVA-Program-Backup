package com.assignments.array;

import java.util.Scanner;

public class SumOfEvenIndex
{
	public static void sumevenindex(int[] num)
	{
		int sum=0;
		for(int i=0;i<=num.length-1;i++)
		{
			if(i%2==0)
			{
				sum=sum+num[i];
			}
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
		sumevenindex(num);
		sc.close();
	}

}
