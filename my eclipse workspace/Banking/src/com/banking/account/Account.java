package com.banking.account;

public class Account 
{
	private long accno;
	private double bal;
	private String name;
	
//	public Account(long accno,double bal,String name)
//	{
//		this.accno=accno;
//		this.bal=bal;
//		this.name=name;
//	}

	public long getAccno() 
	{
		return accno;
	}

	public void setAccno(long accno) 
	{
		this.accno = accno;
	}

	public double getBal() 
	{
		return bal;
	}

	public void setBal(double bal)
	{
		this.bal = bal;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

}
