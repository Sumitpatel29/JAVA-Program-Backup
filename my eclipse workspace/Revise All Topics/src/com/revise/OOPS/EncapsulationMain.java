package com.revise.OOPS;
// creating a simple login page Using encapsulation 
 class User
{
	private String email;	//declaring data members as private
	private String pw;
	
	public String getEmail()   //accessing value using public getter method
	{
		return email;
	}
	public void setEmail(String email)  //updating value using public setter method
	{
		this.email = email;
	}
	public String getPw()
	{
		return pw;
	}
	public void setPw(String pw) 
	{
		this.pw = pw;
	}
}
 class UserService
 {
	 public void signup(String email,String pw,User u1)  
	 {
		 u1.setEmail(email);
		 u1.setPw(pw);
	 }
	 public void login(String email,String pw,User u1)
	 {
		 if(u1.getEmail()==email && u1.getPw()==pw)
		 {
			 System.out.println("Logged in");
		 }
		 else
		 {
			 System.out.println("Invalid email or password");
		 }
	 }
 }
public class EncapsulationMain 
{
	public static void main(String[] args)
	{
		UserService s1=new UserService();
		User sumit=new User();
		s1.signup("sumit@gmail.com", "Sumit@1234", sumit);
		s1.login("sumit@gmail.com", "Sumit@1234", sumit);
	}
}
