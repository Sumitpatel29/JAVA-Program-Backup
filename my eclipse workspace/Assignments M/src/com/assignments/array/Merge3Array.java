package com.assignments.array;

public class Merge3Array 
{
	public static int[] mergearray(int[] n1,int[] n2,int[] n3)
//	{
//		int[] res=new int[n1.length+n2.length+n3.length];
//		for (int i = 0; i < n1.length; i++) 
//		{
//			res[i]=n1[i];
//		}
//		for (int j = 0; j < n2.length; j++)
//		{
//			res[n2.length+j]=n2[j];
//		}
//		for (int k = 0; k < .length; k++)
//		{
//			res[n3.length+k]=n3[k];
//		}
//		print(res);
//		return res;	
//	}
	public static void print(int[] num)
	{
		for (int i = 0; i < num.length; i++) 
		{
			System.out.print(num[i]+" ");
		}
	}
	

	public static void main(String[] args) 
	{
		int[] n1= {2,3,4,5};
		int[] n2= {9,10,11,23};
		int[] n3= {54,56,99};
		mergearray(n1,n2,n3);

	}

}
