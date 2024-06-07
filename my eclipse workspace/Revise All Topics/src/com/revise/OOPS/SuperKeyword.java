package com.revise.OOPS;

class Demo1
{
	protected void test()
	{
		System.out.println("test of superclass");
	}
}
class Demo2 extends Demo1    //inheritance is mandatory 
{
	public void test() //we can increase the visibility of overridden method but can't increase security.
					   
	{
		super.test();  //super keyword is used to call the immediate superclass.//->super keyword is inbuilt reference variable in java,
						//created by JVM and will point to immediate superclass.
                      //it can be used only within the body of non-static method,in order to point the properties of immediate parent class.
		System.out.println("Overridden test method");
	}
}
public class SuperKeyword 
{
	public static void main(String[] args) 
	{
		Demo2 d1=new Demo2();
		d1.test();
	}
}
