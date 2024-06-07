package com.test.test1;

import java.util.Scanner;

public class CalculateBill 
{
	public static double bill(int unit)
	{
		if(unit<=100)
		{
			return unit*2;
		}
		if(unit>=101 && unit<=200)
		{
			unit=unit-100;
			return unit*4.5;
		}
		if(unit>=201 && unit<=500)
		{
			unit=unit-100;
			return unit*6;
		}
		if(unit>=501)
		{
			unit=unit-100;
			return unit*7;
		}
		return unit;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your units: ");
		int unit=sc.nextInt();
		System.out.println(bill(unit));
	}
}
