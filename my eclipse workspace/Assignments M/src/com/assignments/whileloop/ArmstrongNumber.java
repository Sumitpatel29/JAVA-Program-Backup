package com.assignments.whileloop;

import java.util.Scanner;

public class ArmstrongNumber 
{
	
	public static boolean isArmstrong(int num) 
	{
		int sum = 0;
		int temp = num;
		while (temp > 0) 
		{
			sum += Math.pow(temp % 10, 3);
			temp=temp/ 10;
		}
		if(num==sum)
		{
		return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number to check Armstrong or not:-");
		int n=sc.nextInt();
		System.out.println(isArmstrong(n));
		
	}

}

//------------------LOGIC 2 (WITHOUT USING SPECIAL FUNCTION)--------------------------//
	/*
	public static boolean isArmstrong2(int num) 
	{
		int sum = 0;
		int temp = num;
		while (temp > 0) 
		{
			int digit=temp%10;
			sum=sum+digit*digit*digit;    //we are doing for 3 digit number so the logic is digit*digit*digit,like that if we do it for 2 digit,that will be digit*digit only.
			temp=temp/ 10;
		}
		if(num==sum)
		{
		return true;
		}
		else
		{
			return false;
		}
	}
*/



















