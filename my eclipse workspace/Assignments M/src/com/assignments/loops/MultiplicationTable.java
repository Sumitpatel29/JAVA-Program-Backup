/*Write s program that prompts the user to input a positive integer.It should then print the multiplication table of that number*/

package com.assignments.loops;

import java.util.Scanner;

public class MultiplicationTable 
{
	public static void multiply(int n)
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
		
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	multiply(n);
	sc.close();
}
}
