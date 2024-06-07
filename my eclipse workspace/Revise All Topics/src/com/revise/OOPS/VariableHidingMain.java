package com.revise.OOPS;

class Father
{
	static int x=90; //same static variable as subclass
	public static void bike() //static method with same name and same argument
	{
		System.out.println("Splendor");
	}
}
class Son extends Father
{
	static int x=10; //Variable hiding:- If subclass and superclass contains same static variables then it is known as variable hiding or variable shadowing 
	public static void bike() //Method hiding:- If subclass and superclass contains Static methods with same name and same arguments then it is called as method hiding
	{
		System.out.println("Modified Splendor");
	}
}
public class VariableHidingMain
{
	public static void main(String[] args)
	{
		Son.bike();
		System.out.println(Son.x);
		Father.bike();
		System.out.println(Father.x);
	}

}
