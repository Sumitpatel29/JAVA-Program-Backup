package com.assignments.string;

import java.util.Scanner;

public class CharArrayToString 
{
	public static String chararraytostring(char[] ch)
	{
		String res="";
		for (int i = 0; i < ch.length; i++)
		{
			res=res+ch[i];
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		char[] ch= {'a','b','g','s','w'};
//		System.out.println(chararraytostring(ch));
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		System.out.println("Enter characters:");
		char[] ch=new char[n];
		for (int i = 0; i < ch.length; i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		System.out.println(chararraytostring(ch));

	}

}
