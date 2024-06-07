//---------EXAMPLE OF INITERFACE----------//

package com.oops.interface1;
interface run1   // super interface
{
	int a=5; //public static final int a=5;
	void test(); //public static void test();
}
interface run2 extends run1  //implementation class
{
	void count();
}
public class Main1 implements run2
{
	@Override
	public void count()
	{
		System.out.println("Count() abstract of run2 is overridden");
	}
	@Override
	public void test()
	{
		System.out.println("test() abstract of run1 is overridden");
	}
	public static void main(String[] args) 
	{
		Main1 m1=new Main1();
		m1.count();
		m1.test();
	}

}
