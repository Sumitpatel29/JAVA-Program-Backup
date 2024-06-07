package com.test.test1;

import java.util.Scanner;

public class ckeckAlphabet 
{
    public static boolean check(char alpha)
    {
    	if(alpha >='a' && alpha<='z' || alpha >='A' && alpha<='Z')
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
System.out.println("Enter a character:");
char alpha=sc.next().charAt(0);
System.out.println(check(alpha));
	}
}
