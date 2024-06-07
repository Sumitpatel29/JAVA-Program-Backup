package com.banking.Services;

import com.banking.account.Account;
import com.banking.implementation.GooglePay;
import com.banking.implementation.PhonePe;
import com.banking.implementation.User;

public class UserServices
{
	User u1;
//	public UserServices(User u1) 
//	{
//		this.u1=u1;
//	}
	public User login(int pin,Account a1)
	{
		if(pin==1111)
		{
			u1=new PhonePe(a1);
			return u1;
		}
		else if(pin==2222)
		{
			u1=new GooglePay(a1);
			return u1;
		}
		else
		{
			System.out.println("Invalid Pin");
			return u1;
		}
	}

}
