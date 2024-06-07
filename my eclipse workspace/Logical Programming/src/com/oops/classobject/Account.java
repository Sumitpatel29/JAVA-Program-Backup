package com.oops.classobject;

public class Account
{
	String name;
	long accno;
	String branch;
	String ifsc;
	double bal;
	static String bankname;

	public Account(String name, long accno, String branch,String ifsc) //initialization by using constructor
	{
		this.name=name;
		this.accno=accno;
		this.branch=branch;
		this.ifsc=ifsc;
		System.out.println(name + "\n"+ accno + "\n"+ branch + "\n"+ifsc );
	}
	public void showDetails()
	{
		System.out.println("name = " +name);
		System.out.println("AccountNumber = " +accno);
		System.out.println("Branch = " +branch);
		System.out.println("IFSC = " +ifsc);
	}
	public void deposit(double amt)
	{
		if(amt>=0)
		{
			bal=bal+amt;
			System.out.println("Deposited "+amt +" by "+name+ " and your current balance is "+bal);
		}
	}
	public void withdraw(double amt)
	{
		if(amt>=0 && bal>=amt)
		{
			bal=bal-amt;
			System.out.println("Withdrawed "+amt +"by "+name+ "and your remaining balance is "+bal);
		}
	}
	public static void main(String[] args)
	{
		Account a1=new Account("sumit",21751485L,"BTM","SBIN0003645");
		//we do constructor initialization when we want to create an object and initialize it at same time
		a1.name = "ytr";//using this type of reference variable we can change the data of a specific variable
		//a1.createaccount("sumit",21751485L,"BTM","SBIN0003645");
		//When we pass the values using a method we call it as method initialization

		a1.deposit(50000.0);
		a1.deposit(94000.0);
		a1.withdraw(5000.0);
	}
}


















