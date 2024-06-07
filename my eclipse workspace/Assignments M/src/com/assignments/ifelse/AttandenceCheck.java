/* A student will not be allowed to sit in exam if his/her attandence is less than 95%.
  Take following input from user 
  Number of classes held
  number of classes attended
  and print percentage of class attended 
  Is student is allowed to sit in exam or not
 */

package com.assignments.ifelse;

import java.util.Scanner;

public class AttandenceCheck 
{ 
public static void attandence(int clsheld,int clsatnd)
{
	double perc=((double)clsatnd/clsheld)*100;
	System.out.println("total class attended is "+perc+"%");
	if(perc>=95.0)
	{
		System.out.println("You are eligible to attend the exam");
	}
	else
	{
		System.out.println("You are not eligible to attend the exam");
	}
}
public static void main(String[] args) 
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter your total no. of class held: ");
 int clsheld=sc.nextInt();
 System.out.println("Enter your total no. of class attended: ");
 int clsatnd=sc.nextInt();
 attandence(clsheld,clsatnd);
 sc.close();
}
}

//-------------USING VOID RETURNTYPE-------------//
/*
public class AttandenceCheck 
{ 
public static String attandence(int clsheld,int clsatnd)
{
	
	double perc=((double)clsatnd/clsheld)*100.0f;
	if(perc>95)
	{
		return "You are eligible to attend the exam";
	}
		return "You are not eligible to attend the exam";
}
public static void main(String[] args) 
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter your total no. of class held: ");
 int clsheld=sc.nextInt();
 System.out.println("Enter your total no. of class attended: ");
 int clsatnd=sc.nextInt();
 System.out.println(attandence(clsheld,clsatnd));
 sc.close();
}
}
*/