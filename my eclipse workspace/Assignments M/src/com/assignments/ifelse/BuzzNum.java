package com.assignments.ifelse;
public class BuzzNum //means if num is divisible by 7 or last digit is 7
{
public static String checkBuzz(int n)
{
	if(n%7==0 || n%10==7)
	{
		return "Number is Buzz Number";
	}
	else
	{
		return "Number is not a Buzz Number";
	}
}
public static void main(String[] args) 
{
 System.out.println(checkBuzz(1));	
}
}
