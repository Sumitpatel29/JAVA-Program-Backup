package com.assignments.array;

import java.util.Scanner;

/* print all the elements less then or equal to the given element.
 input:- int[] num={1,2,2,4,1,5,6,7,1,2}   int n=3
 output:-  1 2 2 1 1 2
 */
public class PrintElement												//half done
{
	public static void printelements(int[] num,int n)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			if(i<n)
			{
				System.out.println(num[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers into the array:");
		int[] num=new int[10];
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Enter key number:");
		int n=sc.nextInt();
		printelements(num,n);
		sc.close();
	}

}
