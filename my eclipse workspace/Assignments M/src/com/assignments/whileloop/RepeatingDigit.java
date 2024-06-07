package com.assignments.whileloop;

import java.util.Scanner;

public class RepeatingDigit
{
	public static boolean check(int n,int[] num)
	{
		int t1=n; //1234
		while(t1>0)//1234->123
		{
			int rem=t1%10;
			int t2=t1/10;
			while(t2>0)
			{
				int r1=t2%10;
				//System.out.println(rem+"=="+r1);
				if(rem==r1)
				{
					return false;
				}
				t2=t2/10;
			}
			t1=t1/10;
		}
		return true;
	}
	public static void printunique(int s,int e)
	{
		
	}
	public static void main(String[] args) 
	{
//		Scanner  sc=new Scanner(System.in);
//		System.out.println("Enter the Array of Digits");
//		int[] num=new int[6];
//		for (int i = 0; i < num.length; i++) 
//		{
//			num[i]=sc.nextInt();			
//		}
//		System.out.println("Enter the num you want to find");
//		int n=sc.nextInt();
//		check(n,num);
	}

}
