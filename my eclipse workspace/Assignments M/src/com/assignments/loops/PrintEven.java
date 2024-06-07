// print numbers as 2 4 6 8...........

package com.assignments.loops;

import java.util.Scanner;

public class PrintEven 
{
	public static void printEvenNum(int end)
	{
		for (int i=2;i<=end;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nth number:");
		int end=sc.nextInt();
		printEvenNum(end);
	}

}
