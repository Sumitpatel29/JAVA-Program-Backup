package com.assignments.string;

import java.util.Scanner;

public class MultiplyTwoStrings
{
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
	public static String multiplytwostr(String str1,String str2)
	{
		return parseInt(str1)*parseInt(str2)+"";
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first String");
		String str1=sc.nextLine();
		System.out.println("Enter second String");
		String str2=sc.nextLine();
		System.out.println(multiplytwostr(str1, str2));

	}

}
