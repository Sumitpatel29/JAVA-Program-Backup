package com.assignments.whileloop;

import java.util.Scanner;

public class ReverseNum 
{
	public static int reverse(int n)
	{
		int reverse=0;								//rev=0
		while (n!=0)								//(n=123 i.e !=0)					
		{													
			int remainder=n%10;						//remainder=123%10  i.e 
			reverse=reverse*10+remainder;			//rev=0*10+3 ;				//int res/reverse=n1*10+n2;
			n=n/10;									//n= 123/10;
		}
		return reverse;
	}
	public static void main(String[] args)			//we are doing *10 bcz we want an extra zero to merge the number
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println(reverse(n));
	}

}
