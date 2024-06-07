package com.assignments.ifelse;

import java.util.Scanner;

public class Leapyear 
{
public static void checkYear(int year)


{
	if((year%4==0 && year%100!=0) || year%400==0)
	{
		System.out.println("Leapyear");
	}
	else
	{
		System.out.println("Not a Leapyear");
	}
}
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("Enter a Year:");
int year=sc.nextInt();
checkYear(year);
}
}
}

//------USING RETURNTYPE(logic 1)-------//
/*
public class Leapyear 
{
public static boolean checkYear(int year)
{
	if((year%4==0 && year%100!=0) || year%400==0)
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
while(true)
{
System.out.println("Enter a Year:");
int year=sc.nextInt();
System.out.println(checkYear(year));
}
}
}
*/
//------USING RETURNTYPE(logic 2)-------//
/*
public class Leapyear 
{
public static boolean checkYear(int year)
{
	if(year%4==0 && year%400==0)
	{
		return true;
	}
	else if(year%100!=0 && year%4==0)
	{
		return true;-
	}
	else
	{
	return false;
	}
}
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("Enter a Year:");
int year=sc.nextInt();
System.out.println(checkYear(year));
}
}
}
*/
//--------Printing all the leapyears from 0 till the user entered the year----------//

 /*
public class Leapyear 
{
public static void checkYear(int start,int end) //taking input from user using scanner class as start year and end year
{
    for(int i=start;i<=end;i++)  //for loop is starting from start's value and going on untill end's value
    {
	if((end%4==0 && end%100!=0) || end%400==0)   //checking the years are leapyear or not
	{
		System.out.print(i+" ");
	}
	}
}
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter start Year:");
int start=sc.nextInt();
System.out.println("Enter end Year:");
int end=sc.nextInt();
checkYear(start,end);
}
}
*/
