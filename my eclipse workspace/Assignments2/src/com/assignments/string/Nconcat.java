package com.assignments.string;

import java.util.Scanner;
//print the previous character n number of times
public class Nconcat 
{
	public static String nconcat(String str)
	{
		String res="";
		for (int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				res=res+concat(str.charAt(i-1),(str.charAt(i)-48)-1);
			}
			else
			{
				res=res+str.charAt(i);
			}
		}
		return res;
	}
	public static String concat(char ch,int n)
	{
		String res="";
		for (int i = 0; i <n; i++) 
		{
			res=res+ch;
		}
		return res;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		System.out.println(nconcat(str));
		

	}

}
