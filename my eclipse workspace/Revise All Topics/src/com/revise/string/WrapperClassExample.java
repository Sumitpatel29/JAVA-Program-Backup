package com.revise.string;

public class WrapperClassExample
{
	public static void main(String[] args)
	{		
		int i1=100;
		System.out.println(i1);
		//Integer i=Integer.valueOf(i1); //convert primitive to java object
		Integer i=i1; //autoboxing
		System.out.println(i);
		
		//Integer i2=new Integer(90);
		Integer i2=90;
		System.out.println(i2);
		int a1=i2;
	}

}
