package com.assignments.algorithm;

public class SelectionSort 
{
	public static int[] selectionsort(int[]  num)
	{
		for(int i=0;i<=num.length-2;i++)
		{
			int s=i;
			for (int j = i+1; j <= num.length-1; j++) 
			{
				if(num[s]>num[j])
				{
					s=j;
				}
			}	
			int temp=num[i];
			num[i]=num[s];
			num[s]=temp;
		}
		print(num);
		return num ;
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
		int[] num= {4,1,2,1,5,3,6};
		selectionsort(num);
	}

}
