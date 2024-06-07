/*
	    double balance=45000;
		double depositamt=20000;
		boolean pancard=false;
		if deposit amount is more then 100000 then check pancard.
		if pancard is false then print a msg that "Link your pancard".
		Else if deposit amt <100000 then directly deposit the amount.
*/


package com.pr.conditionalstatemets;

public class Account 
{
	public static void main(String[] args) 
	{
		double balance=45000;
		double depositamt=20000;
		boolean pancard=false;
		{
			if(depositamt>100000)
			{
				if(pancard==true)
				{
					balance=balance+depositamt;
					System.out.println(balance);
				}
				else
				{
					System.out.println("Link your pancard");
				}
			}
			else
			{
				balance=balance+depositamt;
				System.out.println(balance);
			}
		}
		
	}

}
