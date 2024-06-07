package com.revise.threads;

class Task
{
	synchronized public void print1()
	{
		for (int i = 0; i<=3; i++) 
		{
			System.out.println(i);			
		}
	}
	synchronized public void print2()
	{
		for (int i = 3; i>=0; i--) 
		{
			System.out.println(i);			
		}
	}
}
class ThreadOne extends Thread
{
	Task t1;
	public ThreadOne(Task t1)
	{
		this.t1=t1;
	}
	@Override
	public void run()
	{
		t1.print1();
	}
}
class ThreadTwo extends Thread
{
	Task t1;
	public ThreadTwo(Task t1)
	{
		this.t1=t1;
	}
	@Override
	public void run()
	{
		t1.print2();
	}
}
public class ThreadMain 
{
	public static void main(String[] args) 
	{
		Task task=new Task();
		ThreadOne th1=new ThreadOne(task);
		th1.start();
		ThreadTwo th2=new ThreadTwo(task);
		th2.start();

	}

}
