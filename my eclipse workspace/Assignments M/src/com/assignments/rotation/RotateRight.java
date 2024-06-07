package com.assignments.rotation;

import java.util.Scanner;

public class RotateRight 
{
	/*
	public static long rotate(long n)   //1234-->(O(N))zz
	{
		long first=n/10; //123
		long last=n%10;  //4
		int c=0;         //3
		long t=first;
		while(t>0)
		{
			c++;
			t=t/10;
		}
		long res=1L;	//1000
		for(int i=1;i<=c;i++)
		{
			res=res*10;
		}
		n=last*res+first;//4*1000+123-->4123
		return n;	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a number:");
			int n=sc.nextInt();
			System.out.println(rotate(n));

		}
	}
	 */
	// }

	
	//--------------------------------LOGIC 2-------------------------------------------//
	
	
	public static long rotate2(long n)   //1234-->(O(N))
	{
		long first=n/10; //123
		long last=n%10;  //4
		long t=first;
		long res=1L;	//10-->100-->1000
		while(t>0)
		{
			res=res*10; 
			t=t/10;
		}
		n=last*res+first;//4*1000+123-->4123
		return n;	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a number:");
			int n=sc.nextInt();
			System.out.println(rotate2(n));
		}
	}
}
























