package com.assignments.whileloop;

import java.util.Scanner;

public class SingleDigitCount 
{
	public static int singledigitcount(int start,int end,int digit)
	{
		int c=0;
		for(int i=start;i<=end;i++)
		{
			if(i%10==digit && i/10==digit)
			{
				c=c+2;
			}
			else if(i%10==digit || i/10==digit)
			{
				c++;
			}
//			else                                  
//			{
//				c=c+0;
//			}
			System.out.println(i+"-->"+c);
		}
		return c;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number:");
		int start=sc.nextInt();
		System.out.println("Enter ending number till 99 :");
		int end=sc.nextInt();
		System.out.println("Enter searching digit (0-9):");
		int digit=sc.nextInt();
		System.out.println(singledigitcount(start, end, digit));
	}

}



//------------------------------------------------------------------------------------------------------//

/*
 
 public class SingleDigitCount 
{
public static int singledigitcount2(int start,int end,int digit)
	{
		int c=0;
		for(int i=start;i<=end;i++)
		{
			if(i%10==digit)
			{
				c=c++;
			}
		    if(i/10==digit)
			{
				c++;
			}
			System.out.println(i+"-->"+c);
		}
		return c;
	}
public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number:");
		int start=sc.nextInt();
		System.out.println("Enter ending number:");
		int end=sc.nextInt();
		System.out.println("Enter searching digit:");
		int digit=sc.nextInt();
		System.out.println(singledigitcount2(start, end, digit));
	}
}

*/

