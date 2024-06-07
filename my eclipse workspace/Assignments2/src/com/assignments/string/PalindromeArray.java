package com.assignments.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//print palindrome String in given Array
public class PalindromeArray 
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
	public static List<String> print(String[] str)
	{
		ArrayList<String> a1=new ArrayList<String>();
		for (int i = 0; i < str.length; i++) 
		{
			if (checkpalindrome(str[i]))
			{
				a1.add(str[i]);
			}
		}
		return a1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of String of array");
		int n=sc.nextInt();
		System.out.println("Enter String of array");
		String[] str= new String[n];
		for (int i = 0; i < str.length; i++)
		{
			str[i]=sc.next();
		}
		System.out.println(print(str));
	}

}
