package com.assignments.strings;

import java.util.Scanner;

public class StringInput
{
	public static void print(String[] num)
	{
		System.out.println("Print()");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]+" ");
		}
	}
		public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		String[] num=new String[n];
		System.out.println("Enter String elements: ");		
		for (int i = 0; i < num.length; i++) 
		{
			num[i]=sc.next();
		}
		print(num);
	}

}
