package com.assignments.revise;

import java.math.BigInteger;

public class BigIntegerExample {

	public static void main(String[] args) 
	{
		long a=10L;
		long b=2L;
		BigInteger r1=new BigInteger(a+"");
		BigInteger r2=BigInteger.valueOf(b);
//		BigInteger res=r1.add(r2);
//		System.out.println(res);
//		BigInteger res=r1.multiply(r2);
//		System.out.println(res);
//		BigInteger res=r1.subtract(r2);
//		System.out.println(res);
//		BigInteger res=r1.divide(r2);
//		System.out.println(res);
//		BigInteger res=r1.remainder(r2);
//		System.out.println(res);
		BigInteger res=r2.remainder(r1);
		System.out.println(res);



	}

}
