package com.assignments.array;

import java.util.Scanner;

public class ReverseArray 
{
	public static int[] reverse(int[] num)
	{
		int j=num.length-1;
		for (int i = 0; i < num.length/2; i++)   //for odd array
		{
			int temp=num[i];   //a=a+b;   |
			num[i]=num[j];     //b=a-b;   | --> 2nd logic   here num[i]=a and num[j]=b
			num[j]=temp;	   //a=a-b;   |
			j--;
		}
		return num;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers into the array:");
		int[] num=new int[5];
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}	

		int[] res=(reverse(num));   //we store the address of the object
		for (int i = 0; i < res.length; i++) //iterating a loop to print the new array elements
		{
			System.out.println(res[i]);
		}
		sc.close();
	}
}


