package com.assignments.forloop;

import java.util.Scanner;


//-------------------------*imp*---------------------------//
public class PowerOfNum 
{
	public static double powerofnum(double base,double power)	//Math.pow(double b,double power)
	{
		double res=1;
		for(int i=1;i<=power;i++)
		{
		 res=res*base;
		}
		return res;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the base number:");
		int base=sc.nextInt();
		System.out.println("Enter the power number:");
		int power=sc.nextInt();
		System.out.println(powerofnum(base, power));
		sc.close();
	}

}

//------------------[USING SPECIAL FUNCTION]----------------------------//
/*
//Math.pow(double b,double power)
public static void main(String[] args) 
{
	int res=Math.pow(2,4);
	System.out.println(res);
}
*/
