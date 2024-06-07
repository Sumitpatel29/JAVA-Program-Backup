package com.assignments.arra2;

//{5,0,1,-3,0,0,4,3,8}
//--> o/p:- {0 0 0 5 1 -3 4 3 8 }
public class ReplaceZeroLeft {
	public static int[] left(int[] num)
	{
		int[] res=new int[num.length];
		int j=num.length-1;
		for (int i=0; i<num.length; i++) 
		{
			if(num[i]!=0)
			{
				res[j]=num[i];
				j--;
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
	public static void main(String[] args) {
		int[] num= {5,0,1,-3,0,0,4,3,8};
		left(num);
	}
}
