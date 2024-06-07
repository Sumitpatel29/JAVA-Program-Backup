package com.oops.inheritance;
class Account1
{
	String owner;
	double bal;
	long accno;
	public void deposit(double amt)
	{
		if(amt>=0)
		{
			bal=bal+amt;
			System.out.println("Deposited:"+amt+"Balance is:"+ bal);
		}
	}
	public void withdraw(double amt)
	{
		if(amt>=0 && bal>amt)
		{
			bal=bal-amt;
			System.out.println("Deposited:"+amt+"Balance is:"+ bal);
		}
	}
	class Savings extends Account1
	{
		
		double roi=0.05;
	}
	class Current extends Account1
	{
		double minbal=5000;
		public void withdraw(double amt)
		{
			if(amt>=0 && bal-minbal>amt)
			{
				bal=bal-amt;
				System.out.println("Deposited:"+amt+"Balance is:"+ bal);
			}
		}
	}
}
public class SuperkeywordMain 
{
	public static void main(String[] args) 
	{
		Current c1=new Current(0, 0, null);
	}

}
