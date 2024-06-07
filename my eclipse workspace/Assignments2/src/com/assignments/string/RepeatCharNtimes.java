package com.assignments.string;

import java.util.Scanner;

public class RepeatCharNtimes
{
	public static String repeatcharntimes(char ch,int n)
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
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		System.out.println("Enter how many times u want to repeat");
		int n=sc.nextInt();
		System.out.println(repeatcharntimes(ch, n));
	}
}
