package com.oops.Bank;
public class Services 
{
	public void deposit(double amt,String name,Account a1)
	{
		a1.setName(name);
		a1.setBal(a1.getBal()+amt);
		System.out.println("Deposited amount: "+amt + "in the account of " + a1.getName()+" and your current balance is " + a1.getBal() );
	}
	public void withdraw(double amt,String name,Account a1)
	{
		if(amt>0 && amt<=a1.getBal())
		{
			a1.setBal(a1.getBal()-amt);
			System.out.println("withdrawed amount: "+amt + "in the account of " + a1.getName()+" and your current balance is " + a1.getBal());
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
}
