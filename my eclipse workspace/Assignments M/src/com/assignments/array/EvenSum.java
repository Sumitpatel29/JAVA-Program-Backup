package com.assignments.array;

import java.util.Scanner;

public class EvenSum 
{
	public static void evensum(int[]  num)
	{
		int sum=0;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]%2==0)   //calculating element
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
		evensum(num);
		sc.close();
	}

}
