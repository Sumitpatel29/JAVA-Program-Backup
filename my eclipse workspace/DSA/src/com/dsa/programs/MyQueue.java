package com.dsa.programs;

public class MyQueue //used a 2 pointer aproach
{
	private int[] arr;
	private int front;
	private int rear;
	private int size;
	public MyQueue(int size)
	{
	    this.arr=new int[size];
	    this.size=size;
	    front=rear=-1;
	}
	public boolean isEmpty()  //checks if the queue is empty or not
	{
	    return rear==-1 && front==-1;
	}
	public void add(int data)	//method to add elements/data into the  queue
	{
	    if((rear+1)%size==front)
	    {
	        System.out.println("Queue is full");
	    }
	    else
	    {
	        //arr[++rear]=data;
	        if(front==-1)
	        {
	            front++;
	        }
	        rear=(rear+1)%size;
	        arr[rear]=data;
	    }
	}
	public int peek()	//it will return the top element available in the queue
	{
	    if(front==-1)
	    {
	        System.out.println("");
	    }
	    // return arr[0];
	    return arr[front];
	}
	public int poll()//used to delete and print the element
	{
	    if(isEmpty())
	    {
	        System.out.println("Queue is empty");
	        return -1;
	    }
	    int res=arr[front];
	    if(rear==front)
	    {
	        rear=-1;
	        front=-1;
	    }
	    else
	    {
	        arr[front]=-1;
	        front=(front+1)%size;
	       
	    }
	    return res;
	}
	// public int poll()
	// {
//	     int x=-1;
//	     if(front==-1)
//	     {
//	         System.out.println("Queue is empty");
//	     }
//	     else
//	     {
//	        
//	         x=arr[0];
//	         for(int i=0;i<=rear-1;i++)
//	         {
//	             arr[i]=arr[i+1];
//	         }
//	         if(rear!=-1)
//	         {
//	         rear--;
//	         }
//	     }
//	     return x;
	// }
	public int size()
	{
	    return rear+1;
	}

	@Override
	public String toString() {
	    if(rear==-1)
	    {
	        return "[]";
	    }
	   String res="[";
	   for(int i=0;i<=size-1;i++)
	   {
	       res=res+arr[i]+", ";
	   }
	   return res.substring(0,res.length()-2)+"]";
	   
	}

}
