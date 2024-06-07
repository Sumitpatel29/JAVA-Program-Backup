package com.assignments.string;

import java.util.Scanner;

public class Palindrome 
{
	public static boolean checkpalindrome(String str)
	{
		String res="";
		for (int i = 0; i < str.length(); i++)
		{
			res=str.charAt(i)+res;
		}
		return str.equals(res);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:"); 
		String str=sc.nextLine();
		System.out.println(checkpalindrome(str));
	}

}
