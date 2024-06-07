package com.assignments.ifelse;

import java.util.Scanner;

public class SpecialChar 
{
	public static boolean specialchar(char ch)
	{
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9')
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a Character to check:");
		char ch=sc.next().charAt(0);
		System.out.println(specialchar(ch));
		sc.close();
	}
}
