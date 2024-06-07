//----USING RETURN TYPE------//
package com.test.revise;
public class SumUsingReturntype 
{
 public static int add(int a,int b)//Called method
 {
	 int sum=a+b;
	 return sum;   
 }
public static void main(String[] args) //Calling method 
{
 System.out.println(add(45,85));
 System.out.println(add(12,4));
}
}
