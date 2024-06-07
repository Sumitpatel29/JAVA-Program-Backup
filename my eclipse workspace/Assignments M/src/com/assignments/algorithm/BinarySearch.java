package com.assignments.algorithm;

import java.util.Scanner;

public class BinarySearch 
{
	public static boolean binarysearch(int[] num,int key)
	{
		int l=0;
		int h=num.length-1;
		int mid=l+h/2;
		while(l<=h)
		{
			if(num[mid]==key)
			{
				return true;
			}
			else if(num[mid]>key)
			{
				l=num[mid]+1;
			}
			else 
			{
				h=num[mid]-1;
			}
			mid=(l+h)/2;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter array of numbers:");
		int[] num=new int[10];
		for (int i = 0; i < num.length; i++) 
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Enter key:");
		int n=sc.nextInt();
		System.out.println(binarysearch(num, n));
		sc.close();
	}

}
