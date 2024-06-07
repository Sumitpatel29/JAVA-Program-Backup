package com.assignments.string;

import java.util.Scanner;
//----conditions------//
//1.minimum 8 character
//2.Exactly 1 special Character
//3.Minimum 1 Uppercase Character
//4.Can not Start with Number

public class PasswordVerify 
{
	public static String verify(String pwd)
	{
		if(pwd.length()<8)
		{
			return "weak";
		}
		if(pwd.charAt(0)>='0' && pwd.charAt(0)<='9')
		{
			return "weak";
		}
		int spcl=0;
		int upcs=0;
		for (int i = 0; i < pwd.length();i++)
		{
			if(pwd.charAt(i)>=65 && pwd.charAt(i)>=90)
			{
				upcs++;
			}
			if(!(pwd.charAt(i)>=65 && pwd.charAt(i)<=90 || (pwd.charAt(i)>=97 && pwd.charAt(i)<=122) || (pwd.charAt(i)>=48 && pwd.charAt(i)<=57)))
			{
				spcl++;
			}
		}
		if(spcl==1 && upcs>=1)
		{
			return "strong";
		}
		return "weak";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pwd=sc.next();
		System.out.println(verify(pwd));
	}

}
