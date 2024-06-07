package com.assignments.string;

import java.util.Scanner;

public class ReverseString
{

	public static String reverse(String str)
	{
		String res="";
		for (int i = 0; i < str.length(); i++)
		{
			res=str.charAt(i)+res;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		System.out.println(reverse(str));
	}
}
