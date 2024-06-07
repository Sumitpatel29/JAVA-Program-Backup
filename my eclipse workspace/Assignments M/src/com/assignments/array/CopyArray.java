package com.assignments.array;

import java.util.Scanner;

public class CopyArray 
{
	public static int[] copyarray(int[] num)
	{
		int[] newarr=new int[num.length];  //creating new array
		for (int i = 0; i < num.length; i++) 
		{
			newarr[i]=num[i];
		}
		return newarr;    
	}
//	public static void printarray(int[] num)
//	{
//		for (int i = 0; i < num.length; i++)
//		{
//			System.out.println(num[i]);			
//		}
//	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers into the array:");
		int[] num=new int[5];
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}	
		
		int[] res=(copyarray(num));   //we store the address of the object
		for (int i = 0; i < res.length; i++) //iterating a loop to print the new array elements
		{
			System.out.println(res[i]);
		}
		sc.close();
	}
}
