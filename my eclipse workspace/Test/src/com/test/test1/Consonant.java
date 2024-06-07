package com.test.test1;

import java.util.Scanner;

import javax.xml.soap.SAAJResult;

public class Consonant 
{
	public static String english(char alpha)
	{
		if(alpha >='a' && alpha<='z' || alpha >='A' && alpha<='Z')
    	{
			if((alpha=='a') || (alpha=='e')|| (alpha=='i') || (alpha=='o' )|| (alpha=='u') || (alpha=='A') || (alpha=='E')|| (alpha=='I') || (alpha=='O' )|| (alpha=='U') )
			{
    		return "Vowel";
			}
			else
			{
				return "Consonants";
			}
    	}
		else
		{
		return "Invalid Input";
		}
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character:");
	char alpha=sc.next().charAt(0);
	System.out.println(english(alpha));
}
}
