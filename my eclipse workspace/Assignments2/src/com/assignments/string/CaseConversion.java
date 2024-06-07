package com.assignments.string;

import java.util.Scanner;

public class CaseConversion
{
	public static String lowertoupper(String str)
	{
		String res="";
		for (int i = 0; i < str.length(); i++)
		{
			res=res+(char)(str.charAt(i)-32);
		}
		return res;
	}
	public static String uppertolower(String str)
	{
		String res="";
		for (int i = 0; i < str.length(); i++)
		{
			res=res+(char)(str.charAt(i)+32);
		}
		return res;
	}
	//-------------------WITHOUT FOR LOOP--------------------//
	public static String conversion(String str)
	{
		String res="";
		for (int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')//Converting to Lowercase
			{
				res=res+(char)(str.charAt(i)+32);
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') //converting to UpperCase
			{
				res=res+(char)(str.charAt(i)-32);
			}
		}
		return res;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		//System.out.println(lowertoupper(str));
		//System.out.println(uppertolower(str));
		System.out.println(conversion(str));
		

	}

}
