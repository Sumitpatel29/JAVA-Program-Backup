package com.assignments.arra2;

public class LargestElement
{
	public static int findlargest(int[] num)
	{
		int max=num[0];
		for (int i = 0; i < num.length; i++) 
		{
			if(num[i]>max)
			{
				max=num[i];
			}
		}
		return max;
	}
	public static void main(String[] args)
	{
		int[] num= {1,3,4,6,2,4,2,9};
		System.out.println(findlargest(num));

	}

}
