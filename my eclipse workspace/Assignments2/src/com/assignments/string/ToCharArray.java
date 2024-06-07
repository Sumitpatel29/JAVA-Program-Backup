package com.assignments.string;

import java.util.Arrays;
import java.util.Scanner;

public class ToCharArray 
{
	public static char[] tochararray(String str)
	{
		char[] res=new char[str.length()];
		//System.out.println(Arrays.toString(res));
		for (int i = 0; i < res.length; i++)
		{
			res[i]=str.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) {
//		String str="hello";
//		System.out.println(str.length());
//		System.out.println(str);
//		char[] res=str.toCharArray();
//		System.out.println(res.length);
//		System.out.println(res);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next();
		char[] str1=tochararray(str);   
		for (int i = 0; i < str1.length; i++) 
		{
			System.out.print(str1[i]+"  ");
		}
		//System.out.println(tochararray(str));  ->Using Special Function
	}
}
