package com.assignments.array;

import java.util.Scanner;

public class CopyReverseArray     //only print the array in reverse order
{
	public static int[] copyreversearay(int[] num)
	{
		int[] res=new int[num.length];
		int j=num.length-1;
		for(int i=0;i<=num.length-1;i++)
		{
			res[j]=num[i];
			j--;
		}
		return res;
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
	    int[] res=copyreversearay(num);
	    for (int i = 0; i < res.length; i++) 
	    {
	    	System.out.println(res[i]);
		}
	  sc.close();
	}

}
