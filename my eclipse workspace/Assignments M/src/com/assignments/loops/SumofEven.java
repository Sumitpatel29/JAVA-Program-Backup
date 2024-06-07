package com.assignments.loops;

public class SumofEven 
{
	public static void sumofeven(int n)
	{
		int sum=0;
		for(int i=0;i%2==0;++i)
		{
			sum=n+i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		sumofeven(5);	
	}

}
