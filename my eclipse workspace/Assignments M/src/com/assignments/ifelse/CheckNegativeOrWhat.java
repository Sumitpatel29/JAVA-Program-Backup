package com.assignments.ifelse;
public class CheckNegativeOrWhat 
{
public static void check(int n)
{
	if(n==0)
	{
		System.out.println("Number is 0");
	}
	else if(n>0)
	{
		System.out.println("Number is Positive");
	}
	else
	{
		System.out.println("Number is Negative");
	}
}
public static void main(String[] args) 
{
 check(-78);	
}
}

/*  
 public class CheckNegativeOrWhat 
 
{
public static String check(int n)
{
	if(n==0)
	{
		return "Number is 0";
	}
	else if(n>0)
	{
		return "Number is Positive";
	}
	else
	{
		return "Number is Negative";
	}
}
public static void main(String[] args) 
{
system.out.println(check(-78));	
}
} 
*/