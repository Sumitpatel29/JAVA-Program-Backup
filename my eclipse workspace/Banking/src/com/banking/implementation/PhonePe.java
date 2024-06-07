package com.banking.implementation;

import java.util.Scanner;

import com.banking.account.Account;
import com.banking.account.Transaction;

public class PhonePe implements User
{
	Account account;
	public PhonePe(Account account) 
	{
		this.account=account;
	}
	public void transfer(double amt,Transaction t1)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.SEND 2.RECEIVE");
		int choice=sc.nextInt();
	    if(choice==1) 
	    {
	    	t1.deposit(amt, account);
	    	t1.checkbal(account);
	    }
	    else if(choice==2)
	    {
	    	t1.withdraw(amt, account);
	    	t1.checkbal(account);
	    }
	    else
	    {
	    	System.out.println("Invalid Selection");
	    }
	    sc.close();
	}
}
