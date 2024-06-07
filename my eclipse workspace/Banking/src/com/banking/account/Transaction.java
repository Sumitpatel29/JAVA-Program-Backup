package com.banking.account;

public class Transaction 
{
	public void deposit(double amt,Account account)
	{
		if(amt>0)
		{
			double b=account.getBal()+amt;
			account.setBal(b);
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	public void withdraw(double amt,Account account)
	{
		if(amt>0 && account.getBal()>=amt)
		{
			double bal=account.getBal()-amt;
			account.setBal(bal);
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	public void checkbal(Account account)
	{
		System.out.println("current balance"+account.getBal());
		
	}
}
