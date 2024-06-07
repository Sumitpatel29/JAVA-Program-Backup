package com.assignments.string;

import java.util.Scanner;

public class ConvertStringToNumber 
{
	public static int convert(String str)
	{
		int res=0;
		int j=0;
		if(str.charAt(0)=='-')
		{
			j=1;
		}
		for (int i = j; i < str.length(); i++) 
		{
			 res=res*10+(str.charAt(i)-48);			
		}
		if(str.charAt(0)=='-')
		{
			res=res*-1;
		}
		return res;				
	}
	//----------------return type long------------------------//
	public static long parseInt(String str)
	{
		long res=0L;
		int j=0;
		if(str.charAt(0)=='-')
		{
			j++;
		}
		for (int i =j; i < str.length(); i++) 
		{
			 res=res*10+(str.charAt(i)-48);			
		}
		if(str.charAt(0)=='-')
		{
			res=res*-1;
		}
		return res;				
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String number");
		String num=sc.nextLine();
		System.out.println(convert(num));

	}

}
