package com.banking.utilize;
import java.util.Scanner;

import com.banking.Services.UserServices;
import com.banking.account.Account;
import com.banking.account.Transaction;
import com.banking.implementation.User;
public class MainUser 
{
	public static void main(String[] args) 
	{
		Account account=new Account();
		Transaction t1=new Transaction();
		UserServices us=new UserServices();
		Scanner sc=new Scanner(System.in);
		System.out.println("---------WELCOME TO BANK---------");
		System.out.println("-:ENTER YOUR CHOICE:-");
		System.out.println("1.PhonePe  2.googlePay");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter pin");
			int pin=sc.nextInt();
			User u=us.login(pin, account);
			System.out.println("Enter amount");
			int amt=sc.nextInt();
			u.transfer(amt, t1);
			
		}
		else if(choice==2)
		{
			System.out.println("Enter pin");
			int pin=sc.nextInt();
			User u=us.login(pin, account);
			System.out.println("Enter amount");
			int amt=sc.nextInt();
			u.transfer(amt, t1);
		}
		else
		{
			System.out.println("Invalid Selection");
		}
		sc.close();
		
	}

}
