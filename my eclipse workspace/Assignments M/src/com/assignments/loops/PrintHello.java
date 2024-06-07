/* Print Hello N number of times
  using For loop.
*/
package com.assignments.loops;

import java.util.Scanner;

public class PrintHello 
{
	public static void printHello(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println("Hello");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter how many times you want to print hello: ");
		int x=sc.nextInt();
		printHello(x);
		sc.close();
	}
}
