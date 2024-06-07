/* WAP to calculate the sum of first n natural numbers*/

package com.assignments.loops;

import java.util.Scanner;

public class SumOfNnum 
{
	public static int sumofNum(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	System.out.println(sumofNum(n));
	sc.close();
}
}
