package com.assignments.string;

import java.util.Scanner;

public class LeftRotate 
{
	public static String leftrotate(String str,int n)
	{
		n=n%str.length();
		str=str.substring(n)+str.substring(0,n);	
		return str;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number of rotation");
		int n=sc.nextInt();
		System.out.println("Enter a string:");
		String str=sc.next();
		System.out.println(leftrotate(str, n));
	}

}
