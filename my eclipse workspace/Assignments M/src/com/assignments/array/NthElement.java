package com.assignments.array;

import java.util.Scanner;

/* Display Nth element in an array 
  input:- int[] num={1,2,2,4,1,5,6,7,1,2}    int n=5
  output:-  1
 */
public class NthElement
{
	public static void printNth(int[] num,int n)
	{
		int ns=0;
		for (int i = 0; i < num.length; i++) 
		{
			ns=num[n];
		}
		System.out.println(ns);
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
		System.out.println("Enter Nth number:");
		int n=sc.nextInt();
		printNth(num,n);
		sc.close();
	}

}
