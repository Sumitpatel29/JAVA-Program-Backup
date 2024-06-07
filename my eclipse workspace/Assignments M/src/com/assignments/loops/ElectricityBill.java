//generate electricity bill//----------using for loop----------//

package com.assignments.loops;
import java.util.Scanner;
public class ElectricityBill 
{
	public static double Bill(int unit)
	{
		double amt=0;
		for(int i=1;i<=unit;i++)      //it will get executed for n number of times.that means the time complexity will be more.//
		{
			if(i<=100)
			{
				amt=amt+0;
			}
			else if(i>100 && i<=200)
			{
				amt=i+5;
			}
			else 
			{
				amt=i+10;
			}
		}
		return amt;
	}
	public static double checkamt(double amt)
	{
		if(amt<100)
		{
			return 100;
		}
		else 
		{
			return amt+amt*0.15;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your unit: ");
		int unit=sc.nextInt();
		System.out.println(Bill(unit));
		System.out.println("Enter your amount: ");
		int amt=sc.nextInt();
		System.out.println(checkamt(amt));
		sc.close();
	}              
}

/*
public class ElectricityBill1 
{
	public static void electricbill(int unit)
	{
		double bill;
		if(unit<=199)
		{
			bill=unit*1.20;
			System.out.println("Bill is"+bill);
		}
		else if(unit>=200 && unit<400)
		{
			bill=unit*1.20+(unit-199)*1.50;
			System.out.println("Bill is"+bill);
		}
		else if(unit>=400 && unit<600)
		{
			bill=unit*1.20+(unit-199)*1.50+(unit-400)*1.80;
			if(bill>400)
			{
				bill=bill+100;
			System.out.println("Bill is"+bill);
			}
		}
		else if(unit>=600)
		{
			bill=unit*1.20+(unit-199)*1.50+(unit-400)*1.80+(unit-600)*2.0;
		}
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your unit Consumed:");
	int unit=sc.nextInt();
	electricbill(unit);
	sc.close();
}
}
*/