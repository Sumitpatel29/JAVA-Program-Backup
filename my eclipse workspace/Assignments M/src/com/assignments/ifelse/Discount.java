/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask the user for quantity .
Suppose, one unit will cost 100.
Judge and print total cost for user.*/

package com.assignments.ifelse;

import java.util.Scanner;

public class Discount 
{
	public static double bill(int qty)
	{
		double price=qty*100;
		if((double)price > 1000)
		{
			double disc=price*0.10;
			price=price-disc;	
			System.out.println("you got a discount");
			return price;
		}
		else 
		{
		return price;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the quantity purchased: ");
		int x=sc.nextInt();
		System.out.println("Your price is: ");
		System.out.println(bill(x));
		sc.close();
	}
}


//---------------USING VOID RETURN TYPE---------------//

/*
public class Discount 
{
	public static void bill(int qty)
	{
		double price=qty*100;
		if((double)price > 1000.0)
		{
			double disc=price*0.10;
			price=price-disc;	
			System.out.println("you got 10% Discount and your bill is: "+price);
		}
		else
		{
			System.out.println("your bill is: "+price);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the quantity purchased: ");
		int x=sc.nextInt();
		bill(x);
		sc.close();
	}
}
*/