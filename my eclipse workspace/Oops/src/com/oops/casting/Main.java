package com.oops.casting;


class A
{
	
}
class B extends A
{
	
}
class C extends A
{
	
}
public class Main
{
	public static void test(A a1)     // if the method was non static the we need to create object of main class inside main().
	{
		System.out.println("A a1"+a1);
		//test(new A());
		//test(new B());
	}
	public static void test(B b1)
	{
		System.out.println("B b1"+b1);
	//	test(new A());
		//test(new B());
	}
	public static void main(String[] args) 
	{
		test(new A());
		test(new B());
		test(new C());
	}

}



//-------------------------------------------------------------------------------------------------------//
/*
class A
{
	
}
class B extends A
{
	
}
class C extends A
{
	
}
public class Main
{
	public static void test(A a1)     // if the method was non static the we need to create object of main class inside main().
	{
		System.out.println("A a1"+a1);
		//test(new A());
		//test(new B());
	}
	public void test(B b1)
	{
		System.out.println("B b1"+b1);
	//	test(new A());
		//test(new B());
	}
	public static void main(String[] args) 
	{
	Main m1=new Main;
		test(new A());
		test(new B());
		test(new C());
	}

}

*/
