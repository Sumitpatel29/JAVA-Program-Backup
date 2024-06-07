package com.revise.OOPS;

abstract class Sample1
{
	abstract void test();
	public static void count()
	{
		System.out.println("static count method");
	}
	public void display()
	{
		System.out.println("non static count method");
	}
}
class Child extends Sample
{
	@Override
	public void test()
	{
		System.out.println("Test overridden method of superclass");
	}
}
public class AbstractClass
{
	public static void main(String[] args)
	{
		Sample s1; //reference of abstract class can be created
		//new Sample();  -->Object creation of abstract class is not possible 
		Child c1=new Child();
		c1.test();
	}

}
