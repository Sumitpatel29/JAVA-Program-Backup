/*Print buzz nums*/

package com.assignments.loops;

import java.util.Scanner;
//A number is said to be Buzz Number if it ends with 7 OR is divisible by 7//
public class BuzzNum
{
	public static void buzznum(int start,int end)
	{
		System.out.println("Buzz Numbers");
		for(int i=start;i<=end;i++)
		{
			if(i%7==0 || i%10==7)
			{
				System.out.println(i);
			}
		}	
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your starting number:");
		int start=sc.nextInt();
		System.out.println("Enter your ending number:");
		int end=sc.nextInt();
		buzznum(start,end);
	}

}
