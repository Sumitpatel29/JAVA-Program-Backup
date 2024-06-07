package com.revise.OOPS;

class Sample
{
	protected void test()
	{
		System.out.println("test() of Superclass");
	}
}
class Demo extends Sample
{
	public void test()
	{
		super.test();  //-------->super keyword is inbuilt reference variable in java,created by JVM and will point to immediate superclass.
					            //it can be used only within the body of non-static method,in order to point the properties of immediate parent class.
		System.out.println("test() of subclass");
	}
}
public class SuperKeywordMain 
{
	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		d1.test();
		
	}

}
