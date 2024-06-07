package com.assignments.arra2;

public class ReplaceZeroRight {   

	
	public static int[] right(int[] num)
	{
		int[] res=new int[num.length];
		int j=0;
		for (int i = 0; i < num.length; i++) 
		{
			if(num[i]!=0)
			{
				res[j]=num[i];
				j++;
			}
		}
		print(res);
		return res;
	}
	public static void print(int[] num)
	{
		for (int i = 0; i < num.length; i++) 
		{
			System.out.print(num[i]+ " ");			
		}
	}
	public static void main(String[] args) 
	{
		int[] num= {5,0,1,-3,0,0,4,3,8};
		right(num);

	}

}
