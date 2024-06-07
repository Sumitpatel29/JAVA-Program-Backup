package com.assignments.array;

import java.util.Scanner;

public class Merge2Array 
{
	public static int[] mergearray(int[] n1,int[] n2)
	{
		int[] res=new int[n1.length+n2.length];
		for (int i = 0; i < n1.length; i++) 
		{
			res[i]=n1[i];
		}
		for (int j = 0; j < n2.length; j++)
		{
			res[n1.length+j]=n2[j];
		}
		print(res);
		return res;	
	}
	
	//------------------logic using extra variable--------------------//
	public static int[] mergearray2(int[] n1,int[] n2)
	{
		int[] res=new int[n1.length+n2.length];
		int x=0;
		for (int i = 0; i < n1.length; i++) 
		{
			res[x]=n1[i];
			x++;
		}
		for (int j = 0; j < n2.length; j++)
		{
			res[x]=n2[j];
			x++;
		}
		print(res);
		return res;	
	}
	
	//---------------------logic using single for loop---------------------------------//
	public static int[] mergearray3(int[] n1,int []n2)
	{
		int[] res=new int[n1.length+n2.length];
		int j=0;
		for (int i = 0; i < res.length; i++) 
		{
			if(i<n1.length)
			{
				res[i]=n1[i];
			}
			else
			{
				res[i]=n2[j];
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
			System.out.print(num[i]+" ");
		}
	}
	public static void main(String[] args)
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Numbers into the first array:");
//		int[] num1=new int[3];
//		for(int i=0;i<num1.length;i++)
//		{
//			num1[i]=sc.nextInt();
//		}
//		System.out.println("Enter Numbers into the second array:");
//		int[] num2=new int[3];
//		for(int i=0;i<num2.length;i++)
//		{
//			num2[i]=sc.nextInt();
//		}
//		System.out.println(mergearray(num1, num2));
		int[] n1= {2,3,4,5};
		int[] n2= {9,10,11,23};
//		mergearray(n1,n2);
//		mergearray2(n1,n2);
		mergearray3(n1,n2);

	}

}
