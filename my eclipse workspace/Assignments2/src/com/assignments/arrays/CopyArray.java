package com.assignments.arrays;

public class CopyArray 
{
	public static int[] copy(int[] num)
	{
		int[] res=new int[num.length];
		for (int i = 0; i < num.length; i++) 
		{
			res[i]=num[i];
		}
		print(res);
		return res;
	}
	public static void print(int[] num)
	{
		for (int i = 0; i < num.length; i++) 
		{
			System.out.print(num[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,4,5};
		copy(num);
	}
}
