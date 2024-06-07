package com.dsa.programs;

public class TestClass {

	public static void main(String[] args)
	{
		MyStack m1=new MyStack();
		m1.push(10);
		m1.push(20);
		m1.push(30);
		m1.push(40);
		m1.push(50);
		System.out.println(m1.isFull());
		m1.pop(10);
		System.out.println(m1.isFull());
	//	m1.display(arr);
		

	}

}
