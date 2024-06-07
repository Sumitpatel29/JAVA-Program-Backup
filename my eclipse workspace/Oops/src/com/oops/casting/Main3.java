//----------GOLDEN RULE OF JAVA-------------//
package com.oops.casting;

class parent
{
	public void test()       //2
	{
		System.out.println("Hello");
	}
}
class child extends parent
{
	public void test()		//3
	{
		System.out.println("Java");
	}
}
public class Main3 
{
	public static void main(String[] args) 
	{
	parent p1=new child();  //1
	p1.test();
	}
}
