package com.assignments.recursion;

public class SumDigit 
{
	public static int sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if((n%10)%2==1)
		{
			return 1+sum(n/10);
		}
		return sum(n/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(30));
	}

}
