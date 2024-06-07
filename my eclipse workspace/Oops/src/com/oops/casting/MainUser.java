package com.oops.casting;
class User
{

}
class Customer extends User
{
	public void buyproduct()
	{
		System.out.println("Customer can buy");
	}
	public void cancelproduct()
	{
		System.out.println("Customer can cancel");
	}
}
class Admin extends User
{
	public void addproduct()
	{
		System.out.println("Admin can add");
	}
	public void removeproduct()
	{
		System.out.println("Admin can remove");
	}
}
class Loginpage
{
	public static User login(User u1)
	{
		if(u1 instanceof Customer)
		{
			Customer c1=(Customer) u1;
			return c1;
		}
		else
		{
			Admin a1=(Admin) u1;
			return a1;
		}
	}
}
public class MainUser
{
	public static void main(String[] args)
	{
		Loginpage lp=new Loginpage();
		Customer u1 =(Customer)lp.login(new Customer());
		u1.buyproduct();
		u1.cancelproduct();
		
		Admin a1 =(Admin)lp.login(new Admin());
		a1.addproduct();
		a1.removeproduct();
	}

}
