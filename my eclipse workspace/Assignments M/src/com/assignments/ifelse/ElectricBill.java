/* Generate Electricity bill.
 first 100 unit of bill will be free
  if 1-100 bill is 0
  101-200- bill is 5 per unit
  above 200 is 10 per unit
  Do it like 320 will be first 100 is free and user will pay 5rs for next 100 unit and 10rs for next remaining units*/


package com.assignments.ifelse;

import java.util.Scanner;

public class ElectricBill 
{
	public static void Bill(int unit)
	{
		double bill;
		if(unit>=0 && unit<=100)
		{
			unit=unit-100;
			bill=unit*0;
			System.out.println(bill);
		}
		else if(unit>100 && unit<=200)
		{
			unit=unit-100;
			bill=unit*5;
			System.out.println(bill);
		}
		else if(unit>200)
		{
			unit=unit-200;
			bill=0*100+100*5 + unit*10;
			System.out.println(bill);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your unit: ");
		int unit=sc.nextInt();
		Bill(unit);
		sc.close();
	}              
}

/*
//---------USING RETURN TYPE----------//
public class ElectricBill 
{
public static int Bill(int unit)
{
	if(unit<=100)
	{
	return 0;
	}
	else if(unit>100 && unit<=200)
	{
	return (unit-100)*5;
	}
	else
	{
		//return 500+(unit-200)*10;
	return (0*100)+(100*5)+(unit-200) * 10;
	}
}
public static void main(String[] args) 
{
 Scanner sc=new Scanner(System.in);
 while(true)                             //infinite number if inputs user can give
 {
 System.out.println("Enter your unit: ");
 int unit=sc.nextInt();
 System.out.println(Bill(unit));
 }
}
}
*/