package com.test.test1;

import java.util.Scanner;

public class Leapyear 
{
public static boolean year(int year)
{
	if(year%4==0 && year%100!=0 || year%400==0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an year:");
		int year=sc.nextInt();
		System.out.println(year(year));
	}

}
