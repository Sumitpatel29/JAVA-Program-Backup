package com.assignments.array;

public class CountElement 
{
	public static void main(String[] args) //count the number of elements which is greater then the previous one
	{
		int c=1;
		int[] arr= {7,4,8,2,9};
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>max)
			{
				max=arr[i];
				c++;
			}
		}
		System.out.println(c);
	}         
}
