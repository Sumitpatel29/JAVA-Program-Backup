package com.assignments.arra2;

import java.util.Arrays;

public class EvenFront 
{
	public static int[] evenfrnt(int[] num)
	{
		int[] res=new int[num.length];
		int j=0;
		for (int i = 0; i < num.length; i++) 
		{
			if(num[i]%2==0)
			{
				res[j]=num[i];
				j++;
			}
		}
		//print(res);  [2 4 6 8 0 0 0 0 ]
		for (int i = 0; i < num.length; i++) 
		{
			if(num[i]%2!=0)
			{
				res[j]=num[i];
				j++;
			}
		}
		print(res);
		System.out.println(Arrays.toString(res));
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
		int[] num= {1,2,3,4,5,6,7,8};
		evenfrnt(num);
	}



//----------------------LOGIC 2---------------------------//
/*
public static int[] evenfrnt(int[] num)
{
	int[] res=new int[num.length];
	int m=num.length-1;
	int n=res.length-1;
	int j=0;
	for (int i = 0; i < num.length; i++) 
	{
		if(num[i]%2==0)
		{
			res[j]=num[i];
			j++;
		}
		if(num[m]%2!=0)
		{
			res[n]=num[m];
			n--;
		}
		m--;
	}
	print(res);
	return res;
}*/
}