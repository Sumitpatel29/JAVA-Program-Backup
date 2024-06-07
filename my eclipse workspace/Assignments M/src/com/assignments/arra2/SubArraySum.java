package com.assignments.arra2;

public class SubArraySum
{
	public static int maxsum(int[] num)
	{
		int max=Integer.MIN_VALUE;
		int sum=0;
		for (int i = 0; i < num.length; i++) 
		{
			sum=sum+num[i];
			if(sum>max)
			{
				max=sum;
			}
			if(sum <0)
			{
				sum=0;
			}
		}
		return max;	
	}
	public static void main(String[] args) 
	{
		int[] num= {-7,-2,1,3,-4,8,2};
		System.out.println(maxsum(num));

	} 

}
