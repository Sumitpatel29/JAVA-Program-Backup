package com.dsa.programs;

public class MyStack
{
	final int MAX=5;
	private int[] arr;
	private int top=-1;
	public MyStack()	//initial size of the stack is set to be 5
	{
		this.arr=new int[MAX];
	}
	public boolean isEmpty()	//for checking the stack is empty or not
	{
		return top==-1;
	}
	public boolean isFull()	//for checking the stack is full or not
	{
		return top==MAX-1;
	}
	public int push(int data)	//used to add the elements into the array
	{
		//top++;
		if(top==MAX-1)
		{
			throw new StackOverflowError();
		}
		else
		{
			arr[++top]=data;
		}
		return arr[top];
	}
	public int pop(int data)
	{
		if(top==-1)
		{
			System.err.println("StackUnderFlow");
		}
		else
		{
			arr[top--]=data;
		}
		return arr[top];
	}
	public void display(int[] arr)		//check
	{
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		System.out.println();

	}

}





















