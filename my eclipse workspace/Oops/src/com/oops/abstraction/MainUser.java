package com.oops.abstraction;

interface Hotel
{
	void orderfood();
}
class vegHotel implements Hotel
{
	public void orderfood()
	{
		System.out.println("Veg food ordered");
	}
}
class nonveghotel implements Hotel
{
	public void orderfood()
	{
		System.out.println("Non-Veg food ordered");
	}
}

class SelectHotel
{
	Hotel h1;
	public Hotel selectTypeOfhotel(String color)
	{
		if(color=="green")
		{
			h1=new vegHotel();  //creating subclass object and storing it in parent class objectvariable i.e. h1
			return h1;
		}
		else
		{
			h1=new nonveghotel();
			return h1;
		}
	}	
}
public class MainUser 
{
	public static void main(String[] args) 
	{
		SelectHotel sh=new SelectHotel();
		Hotel h1=sh.selectTypeOfhotel("green");
		h1.orderfood();
		Hotel h2=sh.selectTypeOfhotel("red");
		h2.orderfood();
		Hotel h3=sh.selectTypeOfhotel("Arey Bhai");
		h3.orderfood();
	}

}
