package com.assignments.rotation;

import java.util.Scanner;

public class RotateLeft 
{
	public static long rotate(long n)   
	{
		int c=0;
		long t=n;
		while(t>0)
		{
			c++; 
			t=t/10;
		}
		long res=1L;
		for(int i=1;i<=c-1;i++)
		{
			res=res*10;
		}
		long first=n/res;
		long last=n%res;
		n=last*10+first;
		return n;
	}
	//---------LOGIC 2------------------//
	public static long rotate2(long n)   
	{
		int c=0;
		long t=n;
		long res=1L;
		while(t>9) //1234
		{
			res=res*10;
			t=t/10;
		}
		long first=n/res;
		long last=n%res;
		n=last*10+first;
		return n;
	}
	//for rotate n number of times
	public static long rotate3(long n,int no)   
	{
		for(int i=1;i<=no;i++)
		{
		int c=0;
		long t=n;
		long res=1L;
		while(t>9) //1234
		{
			res=res*10;
			t=t/10;
		}
		long first=n/res;
		long last=n%res;
		n=last*10+first;
	   }
		return n;
	}
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to rotate left:");
	int n=sc.nextInt();
	System.out.println(rotate(n));
	System.out.println(rotate2(n));
	System.out.println();
	System.out.println(rotate3(n, 3));  //here 3 is the number of rotation
	}
}

//-----------------------------------LOGIC 2-----------------------------//
/*
public static long rotate(long n)   
{
	int c=0;
	long t=n;
	long res=1L;
	while(t>9) //1234
	{
		res=res*10;
		t=t/10;
	}
	long first=n/res;
	long last=n%res;
	n=last*10+first;
	return n;
}


*/


