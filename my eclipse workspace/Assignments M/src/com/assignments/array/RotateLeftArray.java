package com.assignments.array;

public class RotateLeftArray 
{
	public static int[] leftrotate(int[] num)
	{
		int res=num[0];
		for (int i = 0; i < num.length; i++) 
		{
			num[i]=num[i+1];
		}
		num[num.length-1]=res;
		return num;
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
		System.out.println(leftrotate(num));
	}

}
