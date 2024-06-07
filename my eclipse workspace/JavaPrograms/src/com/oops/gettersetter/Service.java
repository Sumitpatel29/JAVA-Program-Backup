package com.oops.gettersetter;

public class Service 
{
	public void signUp(String email,String pw,User u1)
	{
		u1.setemail(email);
		u1.setPw(pw);
	}
	public void logIn(String email,String pw,User u1)
	{
		if(email==u1.getEmail() && pw==u1.getPw())
		{
			System.out.println("logged in");
		}
		else
		{
          System.out.println("Invalid email or password");
		}
	}
}
