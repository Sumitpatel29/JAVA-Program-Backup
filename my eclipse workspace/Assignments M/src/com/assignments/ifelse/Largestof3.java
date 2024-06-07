package com.assignments.ifelse;
public class Largestof3 
{
	public static void check(int a,int b,int c)
	{
      if(a>b && a>c)
      {
    	  System.out.println(a+" is largest");
    	  return;
      }
      if(b>a && b>c)
      {
    	  System.out.println(b+" is largest");
    	  return;
      }
      if(c>a && c>b)
      {
    	  System.out.println(c+" is largest");
    	  return;
      }
	}
	public static void main(String[] args) 
	{
	 check(69,50,9);	
	}
}

 //------------OR---------------//

 /* public class Largestof3 
{
	public static int check(int a,int b,int c)
	{
      if(a>b && a>c)
      {
    	  return a;
      }
      else if(b>a && b>c)
      {
    	  return b;
      }
      else
      {
    	  return c;
      }
	}
	public static void main(String[] args) 
	{
		System.out.println(check(4,6,7));
	}
}
 */

// arrange given 3 integers in increment order 
/* input:- int a=12,int b=19,int c=17
output:- a=14,b=17,c=19*/