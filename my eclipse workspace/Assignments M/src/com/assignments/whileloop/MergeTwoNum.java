package com.assignments.whileloop;

import java.util.Scanner;

//merge n2 with right side of n1.

//this logic will work excluding 0(zero).
// int n1=12 , n2=34.o/p:-"1234";
public class MergeTwoNum 
{
	public static long merge(int n1,int n2)
	{
		int t1=n2;
		int c=0;
		while(t1>0)
		{
			c++;
			t1=t1/10;
		}
		long res=1L;
		for(int i=1;i<=c;i++)	
		{
			res=res*10;
		}
		return n1*res+n2;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the first number:");
		int n1=sc.nextInt();
		System.out.println("Enter the second number:");
		int n2=sc.nextInt();
		System.out.println(merge(n1, n2));

	}

}
//---------------------------------------------------------------------------------------//

/*
int n1=n/10;
int n2=n%10;
int t=n1;
int res=1;
while(t>0)
{
	res=res*10;
	t=t/10;
}




*/


















