package com.assignments.ifelse;
import java.util.*;
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
