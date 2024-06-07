package com.assignments.string;

import java.util.Scanner;

public class CheckSubstring
{
	public static boolean startwith(String str,String key)
	{
		if(str.substring(0,key.length()).equals(key))
		{
			return true;
		}
		return false;
	}
	
	public static boolean endwith(String str,String key)
	{
		if(str.substring(str.length()-key.length()).equals(key))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("Enter key");
		String key=sc.nextLine();
		//System.out.println(startwith(str,key));
		System.out.println(endwith(str,key));

	}

}
