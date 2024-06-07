
package com.oops.inheritance;

class Account 
{
	long acno;
	double bal;
	String owner;

	public Account(long acno, double bal, String owner) {
		super();
		this.acno = acno;
		this.bal = bal;
		this.owner = owner;

		System.out.println("Owner Name: "+owner);
		System.out.println("Account Number: "+acno);
		System.out.println("Balance: "+bal);
	}
	public void deposit(double amt)
	{
		bal=bal+amt;
		System.out.println("amount deposited: "+ amt+" Current bal:"+bal);
	}
	public void withdraw(double amt)
	{
		if(amt>0 && bal>amt)
		{
		bal=bal-amt;
		System.out.println("amount withdrawed: "+amt +" Remaining bal:"+bal);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
}
class Savings extends Account   
{
	double roi=0.05;
	
	public Savings(long acno, double bal, String owner) 
	{
		super(acno, bal, owner);
	}
	public void Roi()
	{
		bal=bal+(bal*roi);
	}
}
class Current extends Account
{
	double minBal=5000.0;

	public Current(long acno, double bal, String owner) 
	{
		super(acno, bal, owner);
	}
	public void showMinBal()
	{
		System.out.println("Your minimum balance is:" + minBal);
	}
	public void withdraw(double amt)
	{
		if(amt>0 && bal-minBal>=amt)
		{
		bal=bal-amt;
		System.out.println("amount withdrawed: "+amt +" Remaining bal:"+bal);
		}
		else
		{
			System.out.println("Insufficient amount");
		}
	}
}
 class MainAccount
{
	public static void main(String[] args) 
	{
		System.out.println("-----------------Savings Account---------------------");
		Savings s1=new Savings(456522,0.0,"Sumit");
		s1.deposit(50000);
		s1.withdraw(2000);
		Current c1=new Current(456563,0.0,"Ayush");
		System.out.println("-----------------Current Account---------------------");
		c1.deposit(80000);
		c1.withdraw(76000.0);		
	}
}

/*
package com.oops.inheritance;

class Account 
{
	long acno;
	double bal;
	String owner;
	public void Account(long accountno)
	{

	}
	public void deposit(double amt)
	{
		bal=bal+amt;
		System.out.println("amount deposited: "+amt+"Remaining bal:"+bal);
	}
	public void withdraw(double amt)
	{
		bal=bal-amt;
		System.out.println("amount withdrawed: "+amt +"Remaining bal:"+bal);
	}
}
class Savings extends Account
{
	double roi=0.05;
	public void Roi()
	{
	 bal=bal+(bal*roi);
	}
}
class Current extends Account
{
	double minBal=5000.0;
	public void showMinBil()
	{
		System.out.println("Your minimum balance is:" + minBal);
	}
}
public class MainAccount
{
	public static void main(String[] args) 
	{
		System.out.println("-----Savings Account-----");
	 	Savings s1=new Savings();
	 	s1.deposit(50000);
	 	s1.withdraw(2000);
	 	Current c1=new Current();
	 	System.out.println("-----Current Account-----");
	 	c1.deposit(80000);
	}
}

 */
