package com.assignments.string;

import java.util.Scanner;

public class SeparateAlphaNumeric
{
	public static void separatestring(String str)
	{
		String spcl="";
		String res="";
		int num=0;
		for (int i = 0; i < str.length(); i++)
		{
			if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z'))
			{
				res=res+str.charAt(i);
			}
			else if(str.charAt(i)>='1' && str.charAt(i)<='9')
			{
				num=num*10+(str.charAt(i)-48);
			}
			else
			{
				spcl=spcl+str.charAt(i);
			}
		}
		System.out.println("strings="+ res+"\nnumber="+num+"\nSpecial Character="+spcl);
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		separatestring(str);
		

	}

}
