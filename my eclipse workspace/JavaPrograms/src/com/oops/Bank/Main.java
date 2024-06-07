package com.oops.Bank;
public class Main 
{
 public static void main(String[] args) 
 {
  Services s1=new Services();
  Account a1=new Account();
  s1.deposit(45000.0,"sumit", a1);
  s1.deposit(500000.0,"sumit", a1);
  s1.withdraw(500,"sumit",a1);
 }
}
