package com.oops.casting;

class A1
{
	
}
 class B1 extends A1
{
	public static A1 test(A1 s1)
	{
		return s1;
	}
}
public class Sample2
{
	public static void main(String[] args) 
	{
	
		A1 a1=B1.test(new B1());// or // upcast
		B1 b1 =(B1)B1.test(new B1());// downcast
		A1 a2=B1.test(new A1());
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(a2);
	}
}

//-----------------------------------------------------------------------------------------------------------//

