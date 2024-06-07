package com.test.test1;

import java.util.Scanner;

public class alarmClock 
{
public static String alarm(int day,boolean vacation)
{
	if(vacation==false)
	{
		if(day>=1 && day<=5)
		{
			return "7:00";
		}
		else
		{
			return "10:00";
		}
	}
	else 
	{
		if(day>=1 && day<=5)
		{
			return "10:00";
		}
		else
		{
			return "off";
		}
	}
}
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			while(true)
			{
			System.out.println("Enter your day: ");
			int day=sc.nextInt();
			System.out.println("Enter your vacation is true or false: ");
			boolean vacation=sc.nextBoolean();
			System.out.println(alarm(day, vacation));
			}
	}

}
